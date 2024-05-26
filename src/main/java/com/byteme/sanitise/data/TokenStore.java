package com.byteme.sanitise.data;

import java.util.List;

/**
 * A TokenStore is responsible for returning all the tokens to be sanitised from our data store.
 */
@FunctionalInterface
public interface TokenStore {
  List<String> findTokens();
}
