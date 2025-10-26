package com.poc.calculator.recipe.authenticator.domain.port;

import com.poc.calculator.recipe.authenticator.application.dto.value.Password;

public interface PasswordHashingPort {
  String hash(Password rawPassword);
  boolean verify(Password rawPassword, String hashedPassword);
}