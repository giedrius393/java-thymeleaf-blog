package com.example.javathymeleafblog.controllers;

import com.example.javathymeleafblog.entities.Author;
import com.example.javathymeleafblog.entities.Post;
import com.example.javathymeleafblog.services.PostService;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class HomeController {
  @Autowired
  PostService postService;

  @GetMapping("/")
  public String getHome(Model model) {
    List<Post> posts =  postService.getAllPosts();
    model.addAttribute("posts", posts);
    return "home";
  }
}
