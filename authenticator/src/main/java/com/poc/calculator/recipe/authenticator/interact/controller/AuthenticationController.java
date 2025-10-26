package com.poc.calculator.recipe.authenticator.interact.controller;

import com.poc.calculator.recipe.authenticator.interact.model.AuthenticationRequest;
import com.poc.calculator.recipe.authenticator.interact.model.StatusResponse;
import com.poc.calculator.recipe.authenticator.interact.service.AuthenticationService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

  private final AuthenticationService service;

  public AuthenticationController(AuthenticationService service) {
    this.service = service;
  }

  @PostMapping
  public StatusResponse authenticate(AuthenticationRequest request) {
    return new StatusResponse(null);
  }
}
