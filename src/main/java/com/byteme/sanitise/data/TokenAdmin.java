package com.byteme.sanitise.data;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * A TokenAdmin is in charge of all crud operations surrounding the sanitise tokens.
 * We can use it to create or delete tokens from our inventory
 */
public interface TokenAdmin {
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  class TokenAdminCreateException extends RuntimeException {
    public TokenAdminCreateException(String message, Throwable throwable) {
      super(message, throwable);
    }
  }

  void create(String token);
  void delete(String token);
}

