package com.greenfoxacademy.jenkinsspring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsSpringApplicationTests {

  @Test
  public void contextLoads() {
  }

  @Test
  public void testJenkins() {
    String expected = "Hello Jenkins!!";
    Assert.assertEquals(expected, HelloJenkins.helloJenkins());
  }
}
