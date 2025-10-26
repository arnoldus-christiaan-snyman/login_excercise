package com.poc.calculator.recipe.authenticator.application.usecase;

import com.poc.calculator.recipe.authenticator.domain.repository.UserRepository;
import com.poc.calculator.recipe.authenticator.domain.port.PasswordHashingPort;
import com.poc.calculator.recipe.authenticator.interact.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationUseCase implements AuthenticationService {

  private final UserRepository repository;
  private final PasswordHashingPort passwordHashingPort;

  public AuthenticationUseCase(UserRepository repository, PasswordHashingPort passwordHashingPort) {
    this.repository = repository;
    this.passwordHashingPort = passwordHashingPort;
  }



}
