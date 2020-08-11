package com.tracker.baumGesundheitszustand.exceptions;

public class StadtNotFoundException extends RuntimeException{
    public StadtNotFoundException(String stadtName) {
        super(stadtName + " is not found.");
    }
}
