package com.example.javathymeleafblog.repositories;


import com.example.javathymeleafblog.entities.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {
  @ResultMap("postResultMap")
  @Select("select post.name, text, author.name author_name from post join author on post.AUTHOR_ID = author.ID;")
  public List<Post> getAllPosts();
}
