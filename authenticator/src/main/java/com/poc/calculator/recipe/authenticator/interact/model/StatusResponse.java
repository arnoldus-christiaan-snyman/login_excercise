package com.poc.calculator.recipe.authenticator.interact.model;

import com.poc.calculator.recipe.authenticator.interact.model.value.Status;
import java.util.Objects;
import java.util.Set;

public class StatusResponse {

  private final Set<Status> status;

  public StatusResponse(Set<Status> status) {
    this.status = status;
  }

  public void addStatus(Status status) {
    this.status.add(status);
  }

  public Set<Status> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponse that = (StatusResponse) o;
    return Objects.equals(getStatus(), that.getStatus());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getStatus());
  }
}
