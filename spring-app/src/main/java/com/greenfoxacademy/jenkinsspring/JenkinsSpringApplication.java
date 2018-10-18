package com.greenfoxacademy.jenkinsspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(JenkinsSpringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello Jenkins, I'm a S P R I N G Application!");
  }
}
