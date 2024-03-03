package com.cydeo.tasks;

import java.util.Arrays;

public class swapValues {
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5};
        swap(array, 1,4);
        System.out.println(Arrays.toString(array));
    }

    private static <T> void swap(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
/*
Write a generic method to exchange the positions of two different elements in array.
Sample output:
Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a)); //[3,2,1,4]

 */