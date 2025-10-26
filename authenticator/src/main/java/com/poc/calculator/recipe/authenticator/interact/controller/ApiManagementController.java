package com.poc.calculator.recipe.authenticator.interact.controller;

import com.poc.calculator.recipe.authenticator.interact.model.StatusResponse;
import com.poc.calculator.recipe.authenticator.interact.model.TokenResponse;
import com.poc.calculator.recipe.authenticator.interact.service.ApiManagementService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/api")
public class ApiManagementController {

  private final ApiManagementService service;

  public ApiManagementController(ApiManagementService service) {
    this.service = service;
  }

  @PutMapping
  public StatusResponse createApi() {
    return new StatusResponse(null);
  }

  @PostMapping
  public TokenResponse getAccessToken() {
    return new TokenResponse(null, null, null);
  }

  @PostMapping("/refresh")
  public TokenResponse refreshAccessToken() {
    return new TokenResponse(null, null, null);
  }
}
