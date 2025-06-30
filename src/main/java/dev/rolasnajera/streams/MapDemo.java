package dev.rolasnajera.streams;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        people.stream()
                .map(person -> {
                    person.setAge(person.getAge() + 5);
                    return person;
                })
                .forEach(System.out::println);

    }

}
