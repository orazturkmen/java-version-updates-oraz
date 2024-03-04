package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.cydeo.Calculator.findSum;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;
        System.out.println(pred.test(10));
        System.out.println(pred.test(15));


        Calculate s1 = (x,y) -> System.out.println(x+y);
        s1.calculate(10,5);

        Calculate s2 = (x,y) -> Calculator.findSum(x,y);
        s2.calculate(3,5);

        Calculate s3 = Calculator::findSum;
        s3.calculate(10,30);

        //Reference to a instance method
        Calculator obj = new Calculator();
        Calculate s4 = obj :: findMultiply;
        s4.calculate(5,6);

        Calculate s5 = new Calculator() ::findMultiply;
        s5.calculate(4,5);

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> myClass = new MyClass() ::method;
        System.out.println("my class = " + myClass.apply(10));

        //MyClass t = new MyClass();
        BiFunction<MyClass,Integer,Double> myClass2 = MyClass::method;
        System.out.println(myClass2.apply(new MyClass(), 2));
    }
}
