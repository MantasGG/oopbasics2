package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {

    private final String cardHolderName;
    private final String cardNumber;
    private double balance;

    public DebitCard(String name, String cardNumber, double balance) {
        this.cardHolderName = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    double credit() {
        return 0;
    }

    @Override
    double debit(double amount) {
        try {
            if (this.balance - amount < 0) {
                throw new NotEnoughBalanceException("Customer " + cardHolderName + " with card number " + cardNumber + " have not enough balance!");
            }
            this.balance -= amount;
            return balance;
        } catch (NotEnoughBalanceException e) {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    double balance() {
        return balance;
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
