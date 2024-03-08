package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishTest {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
          new Dish("pork", false, 800, Type.MEAT),
          new Dish("beef", false, 700, Type.MEAT),
          new Dish("chicken", false, 400, Type.MEAT),
          new Dish("fries", true, 530, Type.OTHER),
          new Dish("rice", true, 350, Type.OTHER),
          new Dish("fruit", true, 120, Type.OTHER),
          new Dish("pizza", true, 550, Type.OTHER),
          new Dish("prawns", false, 300, Type.FISH),
          new Dish("salmon", false, 450, Type.FISH)
        );



        //Print all dish's name that has less than 400 calories
        menu.stream()
                .filter(p -> p.getCalories() < 400)
                .forEach(System.out::println);

        System.out.println("*************************************************************************");

        //Print the length of the name of each dish
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        System.out.println("*************************************************************************");

        //Print three high caloric dish name (>300)
        menu.stream()
                .filter(p->p.getCalories()>300)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("*************************************************************************");

        //Print all dish name that are below 400 calories in sorted
        menu.stream()
                .filter(p-> p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
