package com.byteme.sanitise.controller;

import com.byteme.sanitise.data.TokenAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("crudController")
@RequestMapping("/v1.0.0")
public class CrudController implements SanitiseApi {

  private final TokenAdmin tokenAdmin;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/sanitise/admin")
  @Override
  public void createToken(@RequestBody String token) {
    tokenAdmin.create(token);
  }

  @ResponseStatus(HttpStatus.OK)
  @DeleteMapping("/sanitise/admin/{token}")
  @Override
  public void deleteToken(@PathVariable String token) {
    tokenAdmin.delete(token);
  }
}