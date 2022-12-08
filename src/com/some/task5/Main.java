package com.some.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(
                Arrays.asList(
                        new Person("Pidhornyi", "Boris", 18),
                        new Person("Volik", "Alexandr", 17),
                        new Person("Sklyar", "Anton", 20),
                        new Person("Shevchenco", "Alex", 25))
        );
        Sort sort = (String lastName, String firstName) -> (lastName + firstName).length() <= 15;
        System.out.println("The oldest: " + Sort.getOlder(people, sort).toString());
    }
}
