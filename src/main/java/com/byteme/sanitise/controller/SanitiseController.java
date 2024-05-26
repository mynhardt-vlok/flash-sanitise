package com.byteme.sanitise.controller;

import com.byteme.sanitise.service.SanitiseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController("sanitiseController")
@RequestMapping("/v1.0.0")
@RequiredArgsConstructor
public class SanitiseController implements SanitiseApi {
  private final SanitiseService service;

  @PostMapping("/sanitise")
  @ResponseStatus(HttpStatus.OK)
  @Override
  public String sanitise(@RequestBody String message) {
    return service.sanitise(message);
  }
}
