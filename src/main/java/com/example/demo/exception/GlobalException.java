package com.example.demo.exception;
import org.springbootframework.web.bind.annotation.RestControllerAdvice;
import org.springbootframework.web.bind.annotation.ExceptionHandler;
import org.springbootframework.web.bind.annotation.ResponseEntity;


@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(validationException.class)
    public ResponseEntity<String>handlerValidation(validationException ex){
        return new Response<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }
}