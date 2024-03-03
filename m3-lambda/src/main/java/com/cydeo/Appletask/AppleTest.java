package com.cydeo.Appletask;

import com.cydeo.Apple.Color;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 170));
        inventory.add(new Apple(Color.RED, 220));
        inventory.add(new Apple(Color.RED, 70));
        inventory.add(new Apple(Color.GREEN, 150));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 50));
        inventory.add(new Apple(Color.RED, 250));

        List<Apple> apple1 = prettyPrintApple(inventory, new colorApple());
        System.out.println("*******************************************************");
        List<Apple> apple2 = prettyPrintApple(inventory, new weightApple());

    }

    private static List<Apple> prettyPrintApple(List<Apple> inventory, Predicate p){
        for (Apple apple : inventory) {
            String output = p.test(apple);
            System.out.println(output);
        }
        return inventory;
    }
}
