package com.poc.calculator.recipe.authenticator.interact.service;

import com.poc.calculator.recipe.authenticator.domain.model.User;

public interface UserManagementService {

  User createUser(String username, String password, String email);
  boolean updateUserPassword(User currentCredential, String newPassword);

}
