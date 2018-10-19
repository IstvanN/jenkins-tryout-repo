package com.greenfoxacademy.jenkinsspring;

import org.springframework.stereotype.Service;

@Service
public class HelloJenkins {

  private HelloJenkins() {}

  static String helloJenkins() {
    return "Hello Jenkins!";
  }
}
