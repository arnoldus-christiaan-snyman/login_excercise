package com.poc.calculator.recipe.authenticator.application.mapper;

import com.poc.calculator.recipe.authenticator.domain.model.StateRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoToModelMapper<D, M extends StateRecord> {
  D mapModel(M model);
  M mapDto(D dto);
}
