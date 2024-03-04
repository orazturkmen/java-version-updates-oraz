package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        System.out.println("******************PREDICATE**********************");
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(10));

        System.out.println("******************CONSUMER**********************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("****************** BI CONSUMER**********************");
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,3);

        System.out.println("******************FUNCTION**********************");
        Function<String,String> function = fun -> "Hello " + fun;
        System.out.println(function.apply("Cydeo"));

        System.out.println("******************BI FUNCTION**********************");
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("******************SUPPLIER**********************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
