package com.zuoye.service;

import com.zuoye.pojo.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> queryAllComment(Integer id);
    public void   insertComment(Comment comment);
    public Integer commentCount(Integer articleId);
}
