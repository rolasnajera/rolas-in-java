package dev.rolasnajera.streams;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterObject {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Thanos", 50));
        people.add(new Person("Strange", 42));
        people.add(new Person("Scarlet", 32));
        people.add(new Person("Friday", 12));
        people.add(new Person("Jarvis", 18));
        people.add(new Person("Mark", 20));

        people.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getName().contains("S"))
                .forEach(System.out::println);

    }

}
