package com.byteme.sanitise.service;

import com.byteme.sanitise.data.TokenAdmin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(TokenAdmin.TokenAdminCreateException.class)
  public void tokenAdminCreateError() {
    
  }
}
