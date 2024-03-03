package com.cydeo.Appletask;

public class colorApple implements Predicate{

    @Override
    public String test(Apple apple) {
        /*String output = "";
        if (apple.getColor().equals(Color.GREEN)) output = "A Green Apple";
        else if (apple.getColor().equals(Color.RED)) output = "A Red Apple";
        return output;*/
        String weight = "";
        if (apple.getWeight() < 150) weight = "Light";
        if (apple.getWeight() >= 150) weight = "Heavy";
        return "A " + weight + " " + apple.getColor() + " apple";
    }
}
