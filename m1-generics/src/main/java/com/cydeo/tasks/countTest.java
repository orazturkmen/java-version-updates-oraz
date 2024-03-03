package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class countTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int count = countIf(list, new oddPredicate());
        System.out.println("Number of odd integers: " + count);
    }

    private static <T> int countIf(List<T> c, unaryPredicate<T> p){
        int count = 0;
        for (T eachElement : c) {
            if (p.test(eachElement)){
                ++count;
            }
        }
        return count;
    }

}
/*
Write a generic method to count the number of odd elements in a collection that have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:

public interface UnaryPredicate<T> {
public boolean test(T obj);
}

Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);
 */