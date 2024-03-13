package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo", Arrays.asList("160531651","16161616")),
                new Employee(101,"Peter","peter@cydeo", Arrays.asList("160531651","16161616")),
                new Employee(102,"Jack","jack@cydeo", Arrays.asList("160531651","16161616")),
                new Employee(103,"Beckham","beckham@cydeo", Arrays.asList("160531651","16161616"))
        );
    }
}
