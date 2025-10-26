package com.poc.calculator.recipe.authenticator.application.mapper;

import com.poc.calculator.recipe.authenticator.application.dto.UserDto;
import com.poc.calculator.recipe.authenticator.domain.model.User;
import org.mapstruct.Mapping;

public interface UserMapper extends DtoToModelMapper<UserDto, User> {


  @Override
  @Mapping(target = "password.value", source = "password")
  @Mapping(target = "username.value", source = "username")
  UserDto mapModel(User model);

  @Override
  @Mapping(target = "password", source = "password.value")
  @Mapping(target = "username", source = "username.value")
  User mapDto(UserDto dto);
}
