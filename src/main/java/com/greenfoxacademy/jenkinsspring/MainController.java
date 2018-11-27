package com.greenfoxacademy.jenkinsspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("")
  public String showIndex() {
    return "Hello Heroku & Jenkins (with pipeline)! This is Archie's test app for Heroku deployment practicing using Jenkins pipeline.";
  }
}
