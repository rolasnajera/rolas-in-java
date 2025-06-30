package dev.rolasnajera.streams.collectors;

import dev.rolasnajera.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperations {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        // toList
        List<String> names = people.stream().map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        // toSet
        Set<String> namesSet = people.stream().map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println(namesSet);

        // toCollection
        LinkedList<String> linkedList = people.stream().map(Person::getName)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);

        // toMap
        Map<String, Integer> map = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(map);

        // For repeated case
        people.add(new Person("winter soldier", 29));
        Map<String, Integer> mapRepeated = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge, (s1, s2) -> s1));
        System.out.println(mapRepeated);

    }

}
