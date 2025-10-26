package com.poc.calculator.recipe.authenticator.interact.model;

import com.poc.calculator.recipe.authenticator.interact.model.value.Status;
import com.poc.calculator.recipe.authenticator.interact.model.value.Token;
import java.util.Objects;
import java.util.Set;

public class TokenResponse extends StatusResponse {

  private final Token accessToken;
  private final Token refreshToken;

  public TokenResponse(Set<Status> status, Token accessToken, Token refreshToken) {
    super(status);
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
  }

  public Token getAccessToken() {
    return accessToken;
  }

  public Token getRefreshToken() {
    return refreshToken;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    TokenResponse that = (TokenResponse) o;
    return Objects.equals(getAccessToken(), that.getAccessToken())
        && Objects.equals(getRefreshToken(), that.getRefreshToken());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getAccessToken(), getRefreshToken());
  }
}
