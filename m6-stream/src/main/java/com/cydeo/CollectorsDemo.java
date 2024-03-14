package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,6,6,7,7,8);


        //toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numList = nums.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("numList = " + numList);

        Set<Integer> numSet = nums.stream()
                .filter(z-> z%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numSet = " + numSet);

        //toList: returns a Collector interface that gathers the input data into a new list
        List<Integer> numList2 = nums.stream()
                .filter(z-> z%2==0)
                .collect(Collectors.toList());

        //toSet : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numSet2 = nums.stream()
                .filter(z-> z%2==0)
                .collect(Collectors.toSet());

        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println("dishMap = " + dishMap);

        //summingInt(ToIntFunction): returns a Collector that produces the sum of an Integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //counting(): returns a Collector that counts the numbers of the elements
        Long evenCount = nums.stream()
                .filter(z-> z%2==0)
                .collect(Collectors.counting());
        System.out.println("evenCount = " + evenCount);

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("calorieAverage = " + calorieAverage);

        //joining(): is used to join various elements of a characters or string array into a single object
        List<String> courses = Arrays.asList("java", "js", "ts");
        String str = courses.stream()
                .collect(Collectors.joining(", "));
        System.out.println("str = " + str);

        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("veggieDish = " + veggieDish);

        //groupingBy(): is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println("\ndishType = " + dishType);
    }
}
