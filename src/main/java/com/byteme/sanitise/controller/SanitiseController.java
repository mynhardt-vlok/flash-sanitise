package com.byteme.sanitise.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sanitiseController")
@RequestMapping("v1")
public class SanitiseController {
  @PostMapping("sanitise")
  public void sanitise(@RequestBody String message) {

  }
}
