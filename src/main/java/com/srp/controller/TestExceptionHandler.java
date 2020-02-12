package com.srp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.srp.exception.ErrorResponse;
import com.srp.exception.GenericException;
import com.srp.utils.ConfigUtils;
import com.srp.utils.InternalStandardError;

@ControllerAdvice
public class TestExceptionHandler {

    @Autowired
    private ConfigUtils config;

    @ExceptionHandler(value = GenericException.class)
    public ResponseEntity<?> handleError(GenericException exception) {
        InternalStandardError error = exception.getError();
       
        ErrorResponse response = new ErrorResponse(error.geteCode(), error.getStatus().toString(),
                error.getFunction().apply(config, error.geteCode()));

        return new ResponseEntity<>(response, error.getStatus());

    }
}
