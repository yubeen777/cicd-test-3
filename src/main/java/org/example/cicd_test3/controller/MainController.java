package org.example.cicd_test3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping
  public String hello() {
    return "This is auto deployment with container - 2";
  }
}
