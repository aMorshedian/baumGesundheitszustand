package com.tracker.baumGesundheitszustand.exceptions;

public class StrasseNotFoundException extends RuntimeException{
    public StrasseNotFoundException(String message) {
        super(message);
    }
}
