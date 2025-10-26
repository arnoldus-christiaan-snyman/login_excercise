package com.poc.calculator.recipe.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "com.poc.calculator.recipe.notification")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}