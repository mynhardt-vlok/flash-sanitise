package com.byteme.sanitise.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@OpenAPIDefinition(
  info = @Info(
    title = "Flash Sanitise API",
    description = "Welcome to the Flash Sanitise API",
    version = "v1.0.0"
  )
)
@Tag(name = "Flash Sanitise API", description = "The Flash Sanitise API")
public interface SanitiseApi {

  @Operation(
    summary = "Sanitise sensitive tokens within the received message",
    requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
      required = true,
      content = @Content(
        mediaType = "text/plain",
        examples = @ExampleObject(value = "select * from user where id = 1")
      )
    )
  )
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Sanitise specified token in your message")
  })
  default String sanitise(@RequestBody String message) {
    return null;
  }

  @Operation(
    summary = "Add a token to the sensitive list which needs to be sanitised",
    requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
      required = true,
      content = @Content(
        mediaType = "text/plain",
        examples = @ExampleObject(value = "MAYBE")
      )
    )
  )
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Successfully added"),
    @ApiResponse(responseCode = "400", description = "When the same token is added more than once")
  })
  default void createToken(@RequestBody String token) {
    
  }

  @Operation(
    summary = "Add a token to the sensitive list which needs to be sanitised",
    parameters = @Parameter(
      name = "token",
      in = ParameterIn.PATH,
      examples = @ExampleObject(value = "MAYBE")
    )
  )
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Successfully deleted")
  })
  default void deleteToken(@PathVariable String token) {
    
  }
}
