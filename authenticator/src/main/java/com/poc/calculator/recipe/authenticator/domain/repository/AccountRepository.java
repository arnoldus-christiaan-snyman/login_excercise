package com.poc.calculator.recipe.authenticator.domain.repository;

import com.poc.calculator.recipe.authenticator.domain.model.Account;

public interface AccountRepository extends BaseRepository<Account>, UsernameRepository<Account>, EmailRepository<Account> { }
