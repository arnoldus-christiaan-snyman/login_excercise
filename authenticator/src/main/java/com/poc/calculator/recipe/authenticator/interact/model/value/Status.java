package com.poc.calculator.recipe.authenticator.interact.model.value;

import org.springframework.http.HttpStatus;

public record Status(HttpStatus responseCode, String message) {

}
