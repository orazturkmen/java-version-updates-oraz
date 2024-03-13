package com.cydeo.task;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

    }
}
