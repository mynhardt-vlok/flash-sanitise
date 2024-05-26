package com.byteme.sanitise.data;

import java.util.List;

/**
 * A TokenAdmin is in charge of all crud operations surrounding the sanitise tokens.
 * We can use it to create or delete tokens from our inventory
 */
public interface TokenAdmin {
  class TokenAdminCreateException extends RuntimeException {
    public TokenAdminCreateException(String message, Throwable throwable) {
      super(message, throwable);
    }
  }

  void create(String token);
  void delete(String token);
}

