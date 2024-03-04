package com.cydeo.Orangetask;

import com.cydeo.Apple.Color;
import com.cydeo.Appletask.Apple;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(Color.GREEN, 170));
        inventory.add(new Orange(Color.RED, 220));
        inventory.add(new Orange(Color.RED, 70));
        inventory.add(new Orange(Color.GREEN, 150));
        inventory.add(new Orange(Color.GREEN, 200));
        inventory.add(new Orange(Color.RED, 50));
        inventory.add(new Orange(Color.RED, 250));

        OrangeFormatter orangeLambda = orange -> "An Orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory, orangeLambda);

        prettyPrintOrange(inventory, orange -> "An Orange of " + orange.getWeight() + "g");

        System.out.println("***************************************************************************************");
        OrangeFormatter fancyFormatter = orange -> {
            String str = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + str + " " + orange.getColor() + " orange";
        };


        prettyPrintOrange(inventory, fancyFormatter);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){
        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }
}
