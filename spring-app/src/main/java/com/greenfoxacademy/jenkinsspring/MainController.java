package com.greenfoxacademy.jenkinsspring;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  public String showIndex() {
    return "index";
  }
}
