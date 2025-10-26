package com.poc.calculator.recipe.authenticator.infrastructure.security;

import com.poc.calculator.recipe.authenticator.application.dto.value.Password;
import com.poc.calculator.recipe.authenticator.domain.port.EncoderPort;
import org.springframework.stereotype.Component;

@Component
public class Base64EncoderAdapter implements EncoderPort {
  @Override
  public String encode(Password rawPassword) {
    return "";
  }
}
