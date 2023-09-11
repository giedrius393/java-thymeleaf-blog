package com.example.javathymeleafblog.services;

import com.example.javathymeleafblog.entities.Post;

import com.example.javathymeleafblog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  @Autowired
  PostRepository postRepository;

  public List<Post> getAllPosts() {
    return postRepository.getAllPosts();
  }
}
