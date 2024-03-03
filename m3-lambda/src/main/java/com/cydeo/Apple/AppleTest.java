package com.cydeo.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 100));
        inventory.add(new Apple(Color.RED, 500));
        inventory.add(new Apple(Color.GREEN, 150));
        inventory.add(new Apple(Color.RED, 170));
        inventory.add(new Apple(Color.GREEN, 250));
        inventory.add(new Apple(Color.RED, 220));


        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(inventory);
        System.out.println("greenApple = " + greenApple);
        System.out.println("heavyApple = " + heavyApple);

        heavyApple = filterApples(heavyApple, new AppleGreenColorPredicate());
        System.out.println("greenApple = " + heavyApple);

        System.out.println("**********************************************************************");
        // Lambda
        ApplePredicate weightApple = (Apple apple) -> apple.getWeight()>200;
        System.out.println("Heavier than 200: " + filterApples(inventory, weightApple));

        ApplePredicate greenApple2 = apple -> apple.getColor().equals(Color.GREEN);
        System.out.println("Green apples only: " + filterApples(inventory, greenApple2));
        System.out.println("Red Apples Only: " + filterApples(inventory, apple -> apple.getColor().equals(Color.RED)));

        System.out.println("**********************************************************************");
        System.out.println("Red apples heavier than 150: " + filterApples(filterApples(inventory, apple -> apple.getColor().equals(Color.RED)), apple -> apple.getWeight()>150));

        inventory = filterApples(inventory, greenApple2);
        System.out.println("Green apples lighter than 250: " + filterApples(inventory, apple -> apple.getWeight()<250));

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
