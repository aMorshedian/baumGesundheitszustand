package com.tracker.baumGesundheitszustand.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@ControllerAdvice

public class RuntimeExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {StadtNotFoundException.class,StrasseNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        HashMap<String, String> failure = new HashMap<>();
        failure.put("message", bodyOfResponse);
        return handleExceptionInternal(ex, failure,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
