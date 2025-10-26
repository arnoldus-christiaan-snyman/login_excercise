package com.poc.calculator.recipe.authenticator.domain.repository;

import com.poc.calculator.recipe.authenticator.application.dto.value.Email;
import java.util.Optional;

public interface EmailRepository<T> {
  Optional<T> findByEmail(Email email);
  Boolean existsByEmail(Email email);
}
