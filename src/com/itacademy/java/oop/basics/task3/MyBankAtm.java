package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {

    double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(CreditCard creditCard, double amount) {
        try {
            if (this.balance < amount) {
                throw new InsufficientAtmFundsException("Insufficient ATM fund");
            } else {
                creditCard.debit(amount);
                this.balance -= amount;
                System.out.println(
                        creditCard.cardHolderName()
                                + " has made withdrawal with credit card "
                                + creditCard.cardNumber()
                                + " balance: "
                                + creditCard.balance()
                                + " credit: "
                                + creditCard.credit());
            }
        } catch (InsufficientAtmFundsException e) {
            System.out.println(e);
        }
    }

    @Override
    public void withdraw(DebitCard debitCard, double amount) {
        try {
            if (this.balance < amount) {
                throw new InsufficientAtmFundsException("Insufficient ATM fund");
            } else {
                debitCard.debit(amount);
                this.balance -= amount;
                System.out.println(
                        debitCard.cardHolderName()
                                + " has made withdrawal with credit card "
                                + debitCard.cardNumber()
                                + " balance: "
                                + debitCard.balance()
                                + " credit: "
                                + debitCard.credit());
            }
        } catch (InsufficientAtmFundsException e) {
            System.out.println(e);
        }
    }
}
