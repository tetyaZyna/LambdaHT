package com.some.task5;

import java.util.List;

public interface Sort {
    boolean isPersonSuitable(String lastName, String firstName);

    static Person getOlder(List<Person> peopleList, Sort sort){
        Person result = peopleList.get(0);

        for (Person person : peopleList){
            if (sort.isPersonSuitable(person.getLastName(), person.getFirstName())
                    && person.getAge() > result.getAge()){
                result = person;
            }
        }
        return result;
    }
}
