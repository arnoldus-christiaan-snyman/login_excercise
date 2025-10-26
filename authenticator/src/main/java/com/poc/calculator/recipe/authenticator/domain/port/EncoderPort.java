package com.poc.calculator.recipe.authenticator.domain.port;

import com.poc.calculator.recipe.authenticator.application.dto.value.Password;

@FunctionalInterface
public interface EncoderPort {
  String encode(Password rawPassword);
}
