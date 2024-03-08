package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,2,4);
 //       list.forEach(p-> System.out.println(p));
        list.forEach(System.out::println);

        System.out.println("*************************************************************");
        //FILTER
        System.out.println("\nfilter(Predicate): ");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("\ndistinct(): ");
        list.stream()
                .filter(i -> i%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nlimit(n): ");
        list.stream()
                .filter(i->i%2==0)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nskip(n): ");
        list.stream()
                .filter(i->i%2==0)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("\nmap(Function)): ");
        list.stream()
                .filter(i->i%2==0)
                .map(i->i*2 )
                .forEach(System.out::println);

        System.out.println("*************************************************************");


    }
}
