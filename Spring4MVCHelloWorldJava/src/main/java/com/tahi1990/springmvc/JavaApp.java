package com.tahi1990.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class JavaApp {
  private static ApplicationContext context;

  public static void main(String[] args) {
    context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
  }
}
