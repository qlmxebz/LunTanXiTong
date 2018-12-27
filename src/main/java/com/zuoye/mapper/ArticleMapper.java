package com.zuoye.mapper;

import com.zuoye.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
  public   List<Article> queryAllArticle();
  public   Article    queryArticleById(Integer articleId);
  public    void      deleteArticleById(Integer articleId);
  public    void      addArticleById(Integer articleId);
  public    void      updateArticle(Article article);
  public    List<Article>    queryMyArticleById(Integer userId);
  public    void      updateCommentCount(@Param("commentCount")Integer commentCount,@Param("articleId")Integer articleId);
}
