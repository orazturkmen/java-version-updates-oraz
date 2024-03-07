package com.cydeo.quiz;

public class Builder {
    public static void main(String[] args) {
        Laptop hpLaptop = build(() -> {

            Laptop laptop = new Laptop();

            laptop.setCPU("Intel Core i9");
            laptop.setScreenSize("17.3 in");
            laptop.setOS("Windows 11");

            return laptop;

        });

        System.out.println(hpLaptop);
    }

    public static Laptop build(LaptopBuilder laptopBuilder) {
        return laptopBuilder.build();
    }
}
