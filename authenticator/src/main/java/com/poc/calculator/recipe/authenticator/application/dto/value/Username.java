package com.poc.calculator.recipe.authenticator.application.dto.value;

public record Username(String value) {

  public Username {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Username cannot be null or blank");
    }
    if (value.length() < 3 || value.length() > 50) {
      throw new IllegalArgumentException("Username must be between 3 and 50 characters");
    }
    if (value.matches(".*\\s.*")) {
      throw new IllegalArgumentException("Username must not contain whitespace");
    }
    if (!value.matches("^[a-zA-Z0-9._-]{3,50}$")) {
      throw new IllegalArgumentException("Username can only contain alphanumeric characters, dots, underscores, and hyphens");
    }
  }

}
