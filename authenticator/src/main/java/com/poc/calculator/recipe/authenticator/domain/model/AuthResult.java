package com.poc.calculator.recipe.authenticator.domain.model;

public interface AuthResult<T> {
  boolean isSuccessful();
  String getMessage();
  T getData();
}
