package com.byteme.sanitise.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface SanitiseTokenRepository extends ListCrudRepository<SanitiseToken, Integer> {
  @Query("select a.token from SanitiseToken a")
  List<String> findTokens();

  @Query("select a.id from SanitiseToken a where a.token = :token")
  Optional<Integer> findByToken(String token);
}
