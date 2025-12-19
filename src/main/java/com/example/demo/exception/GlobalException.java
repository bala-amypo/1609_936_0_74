package com.example.demo.exception;
import org.springbootframework.web.bind.annotation.RestControllerAdvice;
import org.springbootframework.web.bind.annotation.ExceptionHandler;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(validationException.class)
    public ResponseBody<String>handlerValidation(validationException ex){

    }
}