package com.byteme.sanitise.data;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Component
public class DataProviderImpl implements TokenStore, TokenAdmin {
  private final SanitiseTokenRepository repository;

  public List<String> findTokens() {
    return repository.findTokens();
  }

  public void create(String token) {
    SanitiseToken sanitiseToken = new SanitiseToken();
    sanitiseToken.setToken(token);

    try {
      repository.save(sanitiseToken);
    } catch (Exception ex) {
      log.error("We are unable to persist the token {}", token, ex);
      throw new TokenAdminCreateException("Unable to save", ex);
    }
  }

  @Override
  public void delete(String token) {
    repository.findByToken(token).ifPresent(repository::deleteById);
  }
}