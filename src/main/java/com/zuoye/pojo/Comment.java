package com.zuoye.pojo;

import java.util.Date;

public class Comment {
    private  Integer commentId;
    private  Integer userId;
    private Integer articleId;
    private  Date    commentDate;
    private String  commentContent;

    public Comment() {
    }

    public Comment(Integer commentId, Integer userId, Integer articleId, Date commentDate, String commentContent) {
        this.commentId = commentId;
        this.userId = userId;
        this.articleId = articleId;
        this.commentDate = commentDate;
        this.commentContent = commentContent;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", commentDate=" + commentDate +
                ", commentContent='" + commentContent + '\'' +
                '}';
    }
}
