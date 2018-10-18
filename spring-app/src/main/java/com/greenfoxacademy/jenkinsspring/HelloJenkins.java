package com.greenfoxacademy.jenkinsspring;

import org.springframework.stereotype.Service;

@Service
public class HelloJenkins {

  public static String helloJenkins() {
    return "Hello Jenkins!";
  }
}
