package com.byteme.sanitise.service;

import com.byteme.sanitise.data.TokenStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
@Slf4j
public class SanitiseService {

  private final TokenStore tokenStore;

  public String sanitise(String message) {
    long startPoint = System.currentTimeMillis();

    List<String> unsafeTokens = tokenStore.findTokens();

    String value = message;
    for (String unsafeToken : unsafeTokens) {
      // Some unsafe tokens are build up of several tokens
      List<String> multiToken = new LinkedList<>();
      // We identify this token contains only one word
      if (unsafeToken.matches("\\w+"))
        multiToken.add(unsafeToken);
        // if multi token break it into it's smallest form
      else
        multiToken.addAll(List.of(unsafeToken.split(" ")));

      for (String token : multiToken) {
        if (!token.equals("*") && value.matches("(?i)^" + token + ".*|.*\\b" + token + "\\b.*|" + token + "$"))
          value = value.replaceAll("(?i)" + token, new StringBuilder().repeat("*", token.length()).toString());
      }
    }

    log.debug("Sanitise action completed in {}", System.currentTimeMillis() - startPoint);
    return value;
  }
}