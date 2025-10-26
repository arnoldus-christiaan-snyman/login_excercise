package com.poc.calculator.recipe.authenticator.application.dto;

import com.poc.calculator.recipe.authenticator.domain.model.Account;

public record AccountDto(UserDto user, ApiKeyDto apiKey, int incorrectAttempts, boolean isLocked, boolean isSuspended) {

  public AccountDto {
    if (user == null && apiKey == null) {
      throw new IllegalArgumentException("ApiKey or User is required");
    }
    if (incorrectAttempts < 0) {
      incorrectAttempts = 0;
    }
  }
}
