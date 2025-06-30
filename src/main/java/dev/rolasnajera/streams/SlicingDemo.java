package dev.rolasnajera.streams;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class SlicingDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));
        people.add(new Person("captain america", 90));
        people.add(new Person("winter soldier", 35));

        people.stream().distinct().forEach(System.out::println);

        // limit() intermediate method
        System.out.println("Using limit 3:");
        people.stream().distinct().limit(3).forEach(System.out::println);

        // skip() intermediate method
        System.out.println("Using skip 2:");
        people.stream().distinct().skip(2).forEach(System.out::println);

        System.out.println("Using skipping all:");
        people.stream().distinct().skip(6).forEach(System.out::println);

    }

}
