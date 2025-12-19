package com.example.demo.exception;
import org.springbootframework.web.bind.annotation.RestControllerAdvice;
import org.springbootframework.web.bind.annotation.ExceptionHandler;
import org.springbootframework.web.bind.annotation.ResponseBody;


@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(validationException.class)
    public ResponseBody<String>handlerValidation(validationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }
}