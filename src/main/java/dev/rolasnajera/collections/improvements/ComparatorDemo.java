package dev.rolasnajera.collections.improvements;

import dev.rolasnajera.Person;

import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        // This is in Java7
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        people.forEach(System.out::println);

        // Now using Java 8
        people.sort(Comparator.comparing(Person::getName));
        people.forEach(System.out::println);

        // Using thenComparing
        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

    }

}
