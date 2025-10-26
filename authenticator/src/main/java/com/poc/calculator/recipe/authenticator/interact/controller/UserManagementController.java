package com.poc.calculator.recipe.authenticator.interact.controller;

import com.poc.calculator.recipe.authenticator.interact.model.StatusResponse;
import com.poc.calculator.recipe.authenticator.interact.model.TokenResponse;
import com.poc.calculator.recipe.authenticator.interact.service.UserManagementService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/user")
public class UserManagementController {

  private final UserManagementService service;

  public UserManagementController(UserManagementService service) {
    this.service = service;
  }

  @PutMapping
  public StatusResponse createUser() {
    return new StatusResponse(null);
  }

  @PostMapping
  public TokenResponse getToken() {
    return new TokenResponse(null, null, null);
  }

  @PostMapping("/refresh")
  public TokenResponse refreshAccessToken() {
    return new TokenResponse(null, null, null);
  }
}
