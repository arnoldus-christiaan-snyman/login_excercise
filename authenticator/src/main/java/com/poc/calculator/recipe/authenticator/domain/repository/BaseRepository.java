package com.poc.calculator.recipe.authenticator.domain.repository;

import java.util.Set;

interface BaseRepository<T> {
  Set<T> getAll();
  T create(T newRecord);
  T update(T exitingRecord);
}
