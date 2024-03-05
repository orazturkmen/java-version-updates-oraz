package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

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

//        Comparator<Apple> sortApple = Comparator.comparing(apple -> apple.getWeight());
//        inventory.sort(sortApple);
        System.out.println(inventory);


        //Comparator<Apple> sortApple1 = comparing(Apple::getWeight);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);
    }
}
