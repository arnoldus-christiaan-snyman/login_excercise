package com.poc.calculator.recipe.authenticator.interact.model.value;

public record Token(String value, String type, long expiresIn) {

  public Token {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Token value cannot be null or blank");
    }
    if (type == null || type.isBlank()) {
      throw new IllegalArgumentException("Token type cannot be null or blank");
    }
    if (expiresIn <= 0) {
      throw new IllegalArgumentException("Token expiresIn must be greater than 0");
    }
  }
}
