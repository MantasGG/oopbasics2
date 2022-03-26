package com.itacademy.java.oop.basics.task3;

public class InsufficientAtmFundsException extends RuntimeException {
    public InsufficientAtmFundsException() {
    }

    public InsufficientAtmFundsException(String message) {
        super(message);
    }
}
