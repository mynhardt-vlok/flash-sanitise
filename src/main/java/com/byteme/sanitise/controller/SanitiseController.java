package com.byteme.sanitise.controller;

import com.byteme.sanitise.service.SanitiseService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@OpenAPIDefinition(
  info = @Info(
    title = "Flash Sanitise API",
    description = "Welcome to the Flash Sanitise API",
    version = "v1.0.0"
  )
)
@Tag(name = "Flash Sanitise API", description = "The Flash Sanitise API")
@RestController("sanitiseController")
@RequestMapping("/v1.0.0")
@RequiredArgsConstructor
public class SanitiseController {
  private final SanitiseService service;

  @Operation(
    summary = "Sanitise sensitive tokens within the received message"
  )
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Sanitise specified token in your message")
  })
  @PostMapping("/sanitise")
  @ResponseStatus(HttpStatus.OK)
  public String sanitise(@RequestBody String message) {
    return service.sanitise(message);
  }
}
