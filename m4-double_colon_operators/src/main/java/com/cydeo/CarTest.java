package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        //Zero Argument Constructor
        Supplier<Car>  car1 = () -> new Car();
        System.out.println(car1.get().getModel());


        Supplier<Car> car2 = Car::new;
        System.out.println(car2.get().getModel());


        //One Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 =Car :: new;


        //Two Argument Constructor

        BiFunction<String,Integer,Car> bi1 = Car :: new;
        Car bmw = bi1.apply("BMW", 2020);
        System.out.println(bmw.getMake() + ", " + bmw.getModel());
    }
}
