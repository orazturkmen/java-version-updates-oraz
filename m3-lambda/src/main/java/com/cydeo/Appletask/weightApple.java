package com.cydeo.Appletask;

public class weightApple implements Predicate{

    @Override
    public String test(Apple apple) {
        /*String output = "";
        if (apple.getWeight() < 150) output = "A Light Apple";
        else output = "A Heavy Apple";
        return output;*/

        return "An Apple of " + apple.getWeight() + "g";
    }
}
