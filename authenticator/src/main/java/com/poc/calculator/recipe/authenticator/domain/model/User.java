package com.poc.calculator.recipe.authenticator.domain.model;

public record User(String username, String password, String email, boolean isActive) implements
    StateRecord {
}
