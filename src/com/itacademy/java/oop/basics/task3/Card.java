package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    abstract double credit();

    abstract double debit(double amount);

    abstract double balance();

    abstract String cardHolderName();

    abstract String cardNumber();

}
