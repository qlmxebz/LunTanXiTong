package com.zuoye.service.impl;

import com.zuoye.mapper.CommentMapper;
import com.zuoye.pojo.Comment;
import com.zuoye.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    public List<Comment> queryAllComment(Integer id){
        return this.commentMapper.queryAllComment(id);
    }
    public void   insertComment(Comment comment){
        this.commentMapper.insertComment(comment);
    }
    public Integer commentCount(Integer articleId){
        return this.commentMapper.commentCount(articleId);
    }
}
