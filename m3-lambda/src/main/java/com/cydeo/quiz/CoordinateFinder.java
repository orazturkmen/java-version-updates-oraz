package com.cydeo.quiz;

import java.util.function.BiFunction;

public class CoordinateFinder {
    public static void main(String[] args) {

        Double latitude = 40.7127281;									// Line 1
        Double longitude = -74.0060152;									// Line 2



        BiFunction<Double,Double,String> find = (l1,l2) -> l1 + "\n" + l2 + "\n" + "Düsseldorf";
        System.out.println(find.apply(latitude, longitude));
    }
    public static String apply(Double latitude, Double longitude, BiFunction<Double, Double, String> biFunction) {
        return biFunction.apply(latitude, longitude);					// Line 6
    }
}
