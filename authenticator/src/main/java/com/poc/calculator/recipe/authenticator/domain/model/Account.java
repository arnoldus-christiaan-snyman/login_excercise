package com.poc.calculator.recipe.authenticator.domain.model;

public record Account(User user, ApiKey apiKey, int incorrectAttempts, boolean isLocked, boolean isSuspended, boolean isActive) implements
    StateRecord {

}