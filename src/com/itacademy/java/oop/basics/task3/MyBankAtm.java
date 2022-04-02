package com.itacademy.java.oop.basics.task3;

import java.util.List;

public class MyBankAtm implements Atm {

    double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(List<Card> cards, double amount) {
        for (Card card : cards) {
            try {
                if (this.balance < amount) {
                    throw new InsufficientAtmFundsException("Insufficient ATM fund");
                } else {
                    card.debit(amount);
                    this.balance -= amount;
                    System.out.println(
                            card.cardHolderName()
                                    + " has made withdrawal with card "
                                    + card.cardNumber()
                                    + " balance: "
                                    + card.balance()
                                    + " credit: "
                                    + card.credit());
                }
            } catch (InsufficientAtmFundsException e) {
                System.out.println(e);
            }
        }
    }
}
