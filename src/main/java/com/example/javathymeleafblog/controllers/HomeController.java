package com.example.javathymeleafblog.controllers;

import com.example.javathymeleafblog.entities.Author;
import com.example.javathymeleafblog.entities.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String getHome(Model model) {
    Post post = new Post();
    post.setAuthor(new Author("Vardenis Pavardenis"));
    post.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc dapibus, mauris eget lobortis hendrerit, leo velit faucibus ipsum, at pellentesque neque ligula scelerisque nisl. Proin vulputate sagittis ipsum sit amet gravida. Fusce fermentum ante ante, in scelerisque elit efficitur sed. Donec mattis tempor lectus, in ultrices risus viverra eleifend. Mauris consequat mauris ac purus pharetra, nec imperdiet lectus posuere. Fusce malesuada at purus at elementum. In ultrices purus ac ipsum facilisis rutrum. Nullam efficitur, quam at lacinia eleifend, neque ex semper quam, quis finibus ipsum sapien vel quam. Pellentesque vel nisi eros. Integer non feugiat nulla, sit amet vestibulum est.");
    post.setName("The new Post");

    model.addAttribute("post", post);
    return "home";
  }
}
