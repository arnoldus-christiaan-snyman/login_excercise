package com.poc.calculator.recipe.authenticator.application.mapper;

import com.poc.calculator.recipe.authenticator.application.dto.AccountDto;
import com.poc.calculator.recipe.authenticator.domain.model.Account;

public interface AccountMapper extends DtoToModelMapper<AccountDto, Account> {
}
