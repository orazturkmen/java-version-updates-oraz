package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print all emails: ");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("\nPrint all numbers: ");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
 //               .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
