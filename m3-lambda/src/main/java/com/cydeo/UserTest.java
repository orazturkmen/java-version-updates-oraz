package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Oraz", "Hudayberdi", 28));
        users.add(new User("Juma", "Hudayberdi", 56));
        users.add(new User("Maral", "Hudayberdi", 58));
        users.add(new User("Akjemal", "Hudayberdi", 25));
        users.add(new User("Suray", "Hudayberdi", 18));
        //users.forEach(p-> System.out.println(p));
        System.out.println("**********************************************************");
        printName(users, user -> user.getAge() == 28); //print age = 28

        System.out.println("**********************************************************");
        printName(users, user -> user.getFirstName().startsWith("J")); // print first name starts "J"

        System.out.println("**********************************************************");
        printName(users, user -> true);
    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
