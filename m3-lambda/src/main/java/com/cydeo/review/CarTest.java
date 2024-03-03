package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 150, 2018));
        carList.add(new Car("BMW", 250, 2020));
        carList.add(new Car("Honda", 180, 2015));
        carList.add(new Car("Tesla", 220, 2022));
        carList.add(new Car("Ausi", 220, 2010));

        /*carList.removeIf(car -> car.getYear() < 2020);
        System.out.println(carList);
        System.out.println("0000000000000000000000000000000000000000000000000000000000000");*/

        System.out.println(filterFastCars(carList));
        System.out.println(filterNewCars(carList));
        System.out.println("0000000000000000000000000000000000000000000000000000000000000");

        List<Car> carLambda1 = filter(carList, car -> car.getToSpeed() > 200);
        System.out.println(carLambda1);

        System.out.println(filter(carList, car -> car.getYear() > 2019 & car.getToSpeed()>200));
    }

    private static List<Car> filterFastCars(List<Car> carList){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getToSpeed() > 200){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterNewCars(List<Car> carList){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() > 2019){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }



    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
          if (carPredicate.test(car)) filteredCars.add(car);
        }
        return filteredCars;
    }
}
