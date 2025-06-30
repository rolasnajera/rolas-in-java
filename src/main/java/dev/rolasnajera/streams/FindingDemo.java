package dev.rolasnajera.streams;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));
        people.add(new Person("captain america", 90));
        people.add(new Person("winter soldier", 35));

        Optional<Person> person = people.stream().filter(p -> "winter soldier".equals(p.getName())).findFirst();
        person.ifPresent(System.out::println);

        Optional<Person> personAny = people.stream().filter(p -> p.getAge() > 30).findAny();
        personAny.ifPresent(System.out::println);

    }

}
