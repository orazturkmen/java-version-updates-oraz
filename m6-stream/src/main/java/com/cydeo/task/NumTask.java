package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumTask {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .map(square -> square * square)
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .map(element -> element * element)
                .forEach(System.out::println);

        System.out.println("*********************************************** " + "************************************************");

        List<Integer> num1 = Arrays.asList(1,2,3);
        List<Integer> num2 = Arrays.asList(3,4);

        num1.stream()
                .flatMap(i -> num2.stream().map(j-> new int[]{i,j}))
                .forEach(pair -> System.out.println(Arrays.toString(pair)));
    }
}
