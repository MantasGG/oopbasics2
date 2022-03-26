package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {

    final String cardHolderName;
    final String cardNumber;
    double balance;
    final double credit;
    final double interest = 1;

    public CreditCard(String name, String cardNumber, double balance, double credit) {
        this.cardHolderName = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.credit = credit;
    }

    @Override
    double credit() {
        return credit;
    }

    @Override
    double debit(double amount) {
        if (this.balance - (amount * (1 + (interest / 100))) < this.credit * -1) {
            throw new NotEnoughCreditException("Customer " + cardHolderName + " with card number " + cardNumber + " have not enough credit!");
        }
        this.balance -= amount * (1 + interest / 100);
        return this.balance;
    }

    @Override
    double balance() {
        return this.balance;
    }

    @Override
    String cardHolderName() {
        return cardHolderName;
    }

    @Override
    String cardNumber() {
        return cardNumber;
    }
}
