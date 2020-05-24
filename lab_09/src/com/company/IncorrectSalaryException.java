package com.company;

public class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException() {
        super("Invalid salary. Salary can't bet less than 0");
    }

    public IncorrectSalaryException(String message) {
        super(message);
    }
}
