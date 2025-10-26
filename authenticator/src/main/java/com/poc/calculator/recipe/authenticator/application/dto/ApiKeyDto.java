package com.poc.calculator.recipe.authenticator.application.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record ApiKeyDto(UUID value, LocalDateTime expiryDate) {

  public ApiKeyDto {
    if (value == null) {
      throw new IllegalArgumentException("API key value is required");
    }
    if (expiryDate == null) {
      throw new IllegalArgumentException("Expiry date is required");
    }
  }
}
