package dev.rolasnajera.streams.references;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReference {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Tony", 36));
        list.add(new Person("Steve", 45));
        list.add(new Person("Thor", 38));
        list.add(new Person("Dr. Johns", 25));
        list.add(new Person("Natasha", 26));

        list.forEach(p -> System.out.println(p.toString()));

        System.out.println("Using Constructor reference:");
        list.forEach(System.out::println);

    }

}
