package com.cydeo.Orange;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(Color.GREEN,100));
        inventory.add(new Orange(Color.RED,50));
        inventory.add(new Orange(Color.RED,70));
        inventory.add(new Orange(Color.GREEN,90));
        inventory.add(new Orange(Color.RED,150));
        inventory.add(new Orange(Color.GREEN,170));
        System.out.println(inventory);


        inventory.sort(comparing(Orange::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Orange::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Orange::getWeight)
                .reversed().thenComparing(Orange::getColor));
        System.out.println(inventory);
    }
}
