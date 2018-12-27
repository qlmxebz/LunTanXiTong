package com.zuoye.controller;

import com.zuoye.pojo.Article;
import com.zuoye.pojo.Comment;
import com.zuoye.pojo.User;
import com.zuoye.service.ArticleService;
import com.zuoye.service.CommentService;
import com.zuoye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CommentService commentService;


    @RequestMapping("/queryAllArticle")
    public ModelAndView queryAllArticle(HttpSession httpSession) {
        ModelAndView mv = new ModelAndView("articleList");
        List<Article> listArticle1 = this.articleService.queryAllArticle();
        for (Article i : listArticle1
        ) {
            this.articleService.updateCommentCount(commentService.commentCount(i.getArticleId()), i.getArticleId());
        }
        List<Article> listArticle = this.articleService.queryAllArticle();
        mv.addObject("listArticle", listArticle);
        mv.addObject("user", httpSession.getAttribute("user"));
        return mv;
    }


    @RequestMapping("/updateArticle")
    public String update(@RequestBody Article article, HttpSession session) {
        User loguser = (User) session.getAttribute("user");
        boolean auth=articleService.queryArticleById(article.getArticleId()).getUserId() == loguser.getUserId() || userService.getAuthority(loguser.getUserId()).equals("编辑权限") ||  userService.getAuthority(loguser.getUserId()).equals("管理员权限");
        if (auth){
            this.articleService.updateArticle(article);}
        return "redirect:/article/queryMyArticleById";
    }

    @RequestMapping("/deleteArticleById")
    public String deleteArticleById(Integer articleId,HttpSession session) {
        User loguser = (User) session.getAttribute("user");
        boolean auth=articleService.queryArticleById(articleId).getUserId() == loguser.getUserId() || userService.getAuthority(loguser.getUserId()).equals("删除权限") || userService.getAuthority(loguser.getUserId()).equals("管理员权限");
        if (auth){
        this.articleService.deleteArticleById(articleId);}
        return "redirect:/article/queryMyArticleById";
    }

    @RequestMapping("/insertComment")
    public String insertById(@RequestBody Comment comment) {

        this.commentService.insertComment(comment);
        return "redirect:/article/queryArticleById";
    }

    @RequestMapping("/queryArticleById")
    public String queryById(Integer articleId, Model model) {
        Article article = this.articleService.queryArticleById(articleId);
        List commentList = this.commentService.queryAllComment(articleId);

        model.addAttribute("article", article);
        model.addAttribute("commentList", commentList);

        return "articleItem";
    }

    @RequestMapping("/queryMyArticleById")
    public ModelAndView queryMyArticleById(Integer userId) {
        ModelAndView mv = new ModelAndView("myArticle");
        List<Article> listMyArticle = this.articleService.queryMyArticleById(userId);
        mv.addObject("listMyArticle", listMyArticle);
        return mv;
    }

    @RequestMapping("/queryMyArticleByMyArticleId")
    public String queryMyArticleByMyArticleId(Integer articleId, Model model) {
        Article article = this.articleService.queryArticleById(articleId);
        model.addAttribute("article", article);
        return "myArticleItem";
    }


}