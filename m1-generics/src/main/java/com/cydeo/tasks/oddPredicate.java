package com.cydeo.tasks;

public class oddPredicate implements unaryPredicate<Integer>{
    @Override
    public boolean test(Integer eachElement) {
        return eachElement % 2 !=0;
    }
}
