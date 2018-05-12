package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication
{
  @PostConstruct
  void start(){
    System.out.println("hello world");
  }

  public static void main(String[] args)
  {
    SpringApplication.run(DemoApplication.class, args);
  }
}
