package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {

        Atm myBankAtm = new MyBankAtm(1000);

        Card creditCard = new CreditCard("Mantas", "12345678", 500, 100);
        Card debitCard = new DebitCard("Jonas", "555555", 100);

        try {
            myBankAtm.withdraw((CreditCard) creditCard, 100);
            myBankAtm.withdraw((DebitCard) debitCard, 100);
            myBankAtm.withdraw((CreditCard) creditCard, 900);
            myBankAtm.withdraw((DebitCard) debitCard, 100);
            myBankAtm.withdraw((CreditCard) creditCard, 500);
        } catch (NotEnoughCreditException | NotEnoughBalanceException e) {
            System.out.println(e);
        }
    }
}
