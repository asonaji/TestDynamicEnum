package com.srp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.srp.exception.GenericException;
import com.srp.utils.InternalStandardError;

@RestController
public class TestController {

    @GetMapping("/test/{no}")
    public ResponseEntity<?> test(@PathVariable int no) {

        if (no % 2 == 0) {
            throw new GenericException(InternalStandardError.PRODUCT_NOT_FOUND);
        }

        return ResponseEntity.ok("Hiiii");
    }

}
