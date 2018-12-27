package com.zuoye.service.impl;

import com.zuoye.mapper.ArticleMapper;
import com.zuoye.pojo.Article;
import com.zuoye.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> queryAllArticle() {
        return this.articleMapper.queryAllArticle();

    }

    public Article queryArticleById(Integer articleId) {
        return this.articleMapper.queryArticleById(articleId);
    }

    public void deleteArticleById(Integer articleId) {
        this.articleMapper.deleteArticleById(articleId);
    }

    public void addArticleById(Integer articleId) {
        this.articleMapper.addArticleById(articleId);
    }

    public void updateArticle(Article article) {
        this.articleMapper.updateArticle(article);
    }

    public List<Article> queryMyArticleById(Integer userId) {
        return this.articleMapper.queryMyArticleById(userId);
    }

    public void updateCommentCount(Integer commentCount, Integer articleId) {
        this.articleMapper.updateCommentCount(commentCount, articleId);
    }
}
