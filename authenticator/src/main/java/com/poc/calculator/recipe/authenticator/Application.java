package com.poc.calculator.recipe.authenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.poc.calculator.recipe.authenticator")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}