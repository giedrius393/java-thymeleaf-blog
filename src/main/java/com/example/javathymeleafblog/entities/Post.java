package com.example.javathymeleafblog.entities;

import lombok.Data;

@Data
public class Post {
  private String name;
  private String text;
  private Author author;
}
