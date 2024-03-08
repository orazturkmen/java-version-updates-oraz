package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String> stream = Arrays.stream(courses);

        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> stream2 = courseList.stream();

        List<Course> myCourse = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );

        Stream<Course> myCourseStream = myCourse.stream();

        //Creating Stream Values
        Stream<Integer> stream3 = Stream.of(1,2,3,4);
    }
}
