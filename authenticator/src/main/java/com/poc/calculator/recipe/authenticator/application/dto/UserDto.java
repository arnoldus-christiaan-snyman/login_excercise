package com.poc.calculator.recipe.authenticator.application.dto;

import com.poc.calculator.recipe.authenticator.application.dto.value.Email;
import com.poc.calculator.recipe.authenticator.application.dto.value.Password;
import com.poc.calculator.recipe.authenticator.application.dto.value.Username;

public record UserDto(Username username, Password password, Email email) {

  public UserDto {
    if (username == null) {
      throw new IllegalArgumentException("Username is required");
    }
    if (password == null) {
      throw new IllegalArgumentException("Password is required");
    }
    if (email == null) {
      throw new IllegalArgumentException("Email is required");
    }
  }

}
