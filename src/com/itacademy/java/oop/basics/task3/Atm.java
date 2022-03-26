package com.itacademy.java.oop.basics.task3;

public interface Atm {
    void withdraw(CreditCard creditCard, double amount);

    void withdraw(DebitCard debitCard, double amount);
}
