package com.zuoye.pojo;

import java.util.Date;

public class Article {
    private  Integer articleId;
    private  String  title;
    private  Integer userId;
    private  String userName;
    private  Date    publishDate;
    private  String articleContent;
    private Integer commentCount;

    public Article() {
    }

    public Article(Integer articleId, String title, Integer userId, Date publishDate, String articleContent,
    String userName) {
        this.articleId = articleId;
        this.title = title;
        this.userId = userId;
        this.publishDate = publishDate;
        this.articleContent = articleContent;
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", publishDate=" + publishDate +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}
