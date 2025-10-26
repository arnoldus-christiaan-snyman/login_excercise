package com.poc.calculator.recipe.authenticator.domain.repository;

import com.poc.calculator.recipe.authenticator.application.dto.value.Username;
import java.util.Optional;

public interface UsernameRepository<T> {
  Optional<T> findByUsername(Username username);
  boolean existsByUsername(Username username);
}
