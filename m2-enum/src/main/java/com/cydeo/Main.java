package com.cydeo;

import javax.swing.plaf.ColorUIResource;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();

        for (Currency eachCurrency : currencies) {
            System.out.println(eachCurrency);
        }
    }
}
