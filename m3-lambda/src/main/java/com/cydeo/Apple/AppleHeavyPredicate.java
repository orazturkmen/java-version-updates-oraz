package com.cydeo.Apple;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
