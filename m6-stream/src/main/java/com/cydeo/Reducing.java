package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("sum = " + sum);

        int result = numbers.stream().reduce(0,(a,b)->a+b);
        Optional<Integer> result2 = numbers.stream().reduce((a,b)->a+b);
        System.out.println("result = " + result);

        Integer totalCal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();
        System.out.println("totalCal = " + totalCal);

        System.out.println("********************************" + "********************************");
        //Max and Mix
        int min = numbers.stream().reduce(Integer::min).get();
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum2.get());

        //COUNT
        long dishCount = DishData.getAll().stream().count();
        System.out.println("dishCount = " + dishCount);

        long count = numbers.stream().count();
        System.out.println("count = " + count);

        int min1 = numbers.stream().reduce((a,b) -> a<b? a:b).get();
        System.out.println(min1);
    }
}
