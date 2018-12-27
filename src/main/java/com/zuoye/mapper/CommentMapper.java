package com.zuoye.mapper;

import com.zuoye.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    public List<Comment> queryAllComment(Integer id);
    public void   insertComment(Comment comment);
    public Integer commentCount(@Param("articleId")Integer articleId);



}
