package com.tahi1990.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
  @Bean
  public HelloWorld helloWorld() {
    HelloWorld bean = new HelloWorld();
    bean.setMessage("Hello World!");
    return bean;
  }
}
