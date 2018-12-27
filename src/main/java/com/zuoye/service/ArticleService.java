package com.zuoye.service;

import com.zuoye.pojo.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> queryAllArticle();
    public   Article    queryArticleById(Integer articleId);
    public    void      deleteArticleById(Integer articleId);
    public    void      addArticleById(Integer articleId);
    public    void      updateArticle(Article articleId);
    public    List<Article>    queryMyArticleById(Integer userId);
    public    void      updateCommentCount(Integer commentCount,Integer articleId);

}
