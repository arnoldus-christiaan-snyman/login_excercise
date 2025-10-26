package com.poc.calculator.recipe.authenticator.infrastructure.adapter;

import com.poc.calculator.recipe.authenticator.application.dto.value.Password;
import com.poc.calculator.recipe.authenticator.domain.port.EncoderPort;
import com.poc.calculator.recipe.authenticator.domain.port.PasswordHashingPort;
import org.springframework.stereotype.Component;

@Component
public class PasswordHashingAdapter implements PasswordHashingPort {

  private final EncoderPort encoder;

  public PasswordHashingAdapter(EncoderPort encoderPort) {
    this.encoder = encoderPort;
  }

  @Override
  public String hash(Password rawPassword) {
    return encoder.encode(rawPassword);
  }

  @Override
  public boolean verify(Password rawPassword, String hashedPassword) {
    return hash(rawPassword).equals(hashedPassword);
  }
}
