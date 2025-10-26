package com.poc.calculator.recipe.authenticator.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record ApiKey(UUID value, LocalDateTime expiryDate, boolean isActive) implements
    StateRecord {

  public static ApiKey generate(boolean isActive) {
    return new ApiKey(UUID.randomUUID(), LocalDateTime.now(), isActive);
  }
}
