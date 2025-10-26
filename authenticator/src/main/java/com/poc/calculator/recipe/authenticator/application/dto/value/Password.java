package com.poc.calculator.recipe.authenticator.application.dto.value;

public record Password(String value) {

  public Password {
    if (value == null || value.isBlank() || value.length() < 8) {
      throw new IllegalArgumentException("Password must be at least 8 characters long");
    }
    if (value.matches(".*\\s.*")) {
      throw new IllegalArgumentException("Password must not contain whitespace");
    }
  }

}
