package com.foodDelivery.website.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<String> handleGlobalException(GlobalException ex) {
        
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

   
}
