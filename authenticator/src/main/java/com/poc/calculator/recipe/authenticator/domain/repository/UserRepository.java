package com.poc.calculator.recipe.authenticator.domain.repository;

import com.poc.calculator.recipe.authenticator.domain.model.User;

public interface UserRepository extends BaseRepository<User>, UsernameRepository<User> { }
