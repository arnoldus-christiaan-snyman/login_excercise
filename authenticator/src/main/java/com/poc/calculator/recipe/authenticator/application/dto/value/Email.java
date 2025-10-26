package com.poc.calculator.recipe.authenticator.application.dto.value;

public record Email(String value) {

  public Email {
    if(value == null || value.isBlank()) {
      throw new IllegalArgumentException("Email is required");
    }
    if (!value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
      throw new IllegalArgumentException("Invalid email format");
    }
  }

}
