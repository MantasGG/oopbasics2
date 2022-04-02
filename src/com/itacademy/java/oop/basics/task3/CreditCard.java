package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {

    private final String cardHolderName;
    private final String cardNumber;
    private double balance;
    private final double credit;
    private final double interest = 1;

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
        try {
            if (this.balance - (amount * (1 + (interest / 100))) < this.credit * -1) {
                throw new NotEnoughCreditException("Customer " + cardHolderName + " with card number " + cardNumber + " have not enough credit!");
            }
            this.balance -= amount * (1 + interest / 100);
            return this.balance;
        } catch (NotEnoughCreditException e) {
            System.out.println(e);
            return 0;
        }
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
