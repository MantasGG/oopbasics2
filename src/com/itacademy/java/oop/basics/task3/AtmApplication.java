package com.itacademy.java.oop.basics.task3;

import java.util.ArrayList;
import java.util.List;

public class AtmApplication {
    public static void main(String[] args) {

        Atm myBankAtm = new MyBankAtm(1000);

        Card creditCard = new CreditCard("Mantas", "12345678", 500, 100);
        Card debitCard = new DebitCard("Jonas", "555555", 100);
        Card creditCard1 = new CreditCard("Petras", "87654321", 300, 0);
        Card debitCard1 = new DebitCard("Povilas", "444444", 800);
        Card creditCard2 = new CreditCard("Martynas", "87651234", 400, 20);
        Card debitCard2 = new DebitCard("Andrius", "333333", 200);

        List<Card> cards = new ArrayList<>();

        cards.add(creditCard);
        cards.add(debitCard);
        cards.add(creditCard1);
        cards.add(debitCard1);
        cards.add(creditCard2);
        cards.add(debitCard2);
        cards.add(creditCard);
        cards.add(debitCard);
        cards.add(creditCard1);
        cards.add(debitCard1);
        cards.add(creditCard2);
        cards.add(debitCard2);

        try {
            myBankAtm.withdraw(cards, 100);
        } catch (NotEnoughCreditException | NotEnoughBalanceException e) {
            System.out.println(e);
        }
    }
}
