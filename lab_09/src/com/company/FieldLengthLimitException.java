package com.company;

public class FieldLengthLimitException extends Exception {
    public FieldLengthLimitException() {
        super("Invalid field length.");
    }

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
