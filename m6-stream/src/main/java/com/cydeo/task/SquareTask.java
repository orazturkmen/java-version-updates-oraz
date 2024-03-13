package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SquareTask {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .map(square -> square * square)
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .map(element -> element * element)
                .forEach(System.out::println);
    }
}
