package com.poc.calculator.recipe.authenticator.application.usecase;

import com.poc.calculator.recipe.authenticator.domain.repository.UserRepository;
import com.poc.calculator.recipe.authenticator.interact.service.UserManagementService;
import org.springframework.stereotype.Service;

@Service
public class UserManagementUseCase implements UserManagementService {

  private final UserRepository repository;

  public UserManagementUseCase(UserRepository repository) {
    this.repository = repository;
  }

}
