package com.ruyjfs.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {

  @GetMapping
  public String index() {
    return "<h1>Example Java - Shop Restful</h1>";
  }
}
