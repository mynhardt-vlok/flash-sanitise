package com.byteme.sanitise.controller;

import com.byteme.sanitise.data.TokenAdmin;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("crudController")
@RequestMapping("/v1.0.0")
public class CrudController {

  private final TokenAdmin tokenAdmin;

  @Operation(
    summary = "Add a token to the sensitive list which needs to be sanitised"
  )
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Successfully added"),
    @ApiResponse(responseCode = "400", description = "When the same token is added more than once")
  })
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/sanitise/admin")
  public void createToken(@RequestBody String token) {
    tokenAdmin.create(token);
  }

  @ResponseStatus(HttpStatus.OK)
  @DeleteMapping("/sanitise/admin/{token}")
  public void deleteToken(@PathVariable String token) {
    tokenAdmin.delete(token);
  }
}