package com.poc.calculator.recipe.authenticator.application.dto;

import com.poc.calculator.recipe.authenticator.domain.model.AuthResult;

public record TokenAuthDto(boolean isCorrect, String message, String data) implements
    AuthResult<String> {

  @Override
  public boolean isSuccessful() {
    return isCorrect;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public String getData() {
    return data;
  }
}