package com.cydeo.SocialMediaTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person person1 = new Person("Oraz", 23, Gender.MALE);
        Person person2 = new Person("tom", 25, Gender.MALE);
        Person person3 = new Person("jack", 30, Gender.MALE);
        Person person4 = new Person("sally", 29, Gender.FEMALE);
        Person person5 = new Person("adele", 21, Gender.FEMALE);
        Person person6 = new Person("Madina", 20, Gender.FEMALE);

        List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5,person6);

        print(personList, person -> person.getAge() >= 18 & person.getAge() <= 25 & person.getGender() == Gender.FEMALE);
        print(personList, person -> person.getAge() >= 18 & person.getAge() <= 25 & person.getGender() == Gender.MALE);
    }

    private static void print(List<Person> personList, CheckMember member){
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (member.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
