package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("ALL MATCH: ");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("\nANY MATCH: ");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("\nNONE MATCH: ");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("\nFIND ANY: ");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("\nFIND FIRST: ");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        System.out.println("\nPARALLEL STREAMS (Async): ");
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        System.out.println("***********************************************************************");

        List<String> list1 = Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jeni", "Divya");
        List<String> list2 = Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jeni", "Divya");
        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s->s.startsWith("D")).findAny();

        System.out.println("findFirst = " + findFirst.get());
        System.out.println("findAny = " + findAny.get());

        //MIN AND MAX
        Optional<Dish> min = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println("min = " + min.get());

        Optional<Dish> max = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println("max = " + max.get());
    }
}
