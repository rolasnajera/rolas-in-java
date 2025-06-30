package dev.rolasnajera.streams.collectors;

import dev.rolasnajera.Person;

import java.util.*;
import java.util.stream.Collectors;

public class AggregationOperations {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        // counting() get the number of registers
        //how many in all the list?
        long countAll = people.stream().collect(Collectors.counting());
        System.out.println("All: " + countAll);
        // how many Spider-Man in the list
        long countSpiderMan = people.stream().filter(p -> "spider man".equals(p.getName()))
                .collect(Collectors.counting());
        System.out.println("Spider man: " + countSpiderMan);

        long countSpiderManCount = people.stream().filter(p -> "spider man".equals(p.getName()))
                .count();
        System.out.println("Spider man count: " + countSpiderManCount);

        // Using summingInt() to sum the ages fo all
        long sumAges = people.stream().collect(Collectors.summingInt(Person::getAge));

        System.out.println("Ages sum: " + sumAges);

        double average =  people.stream().collect(Collectors.averagingInt(Person::getAge));
        System.out.println("Average age: " + average);

        // getting maxBy (also can be used the minBy)
        // result: Person{name: 'captain america', age: 90}
        Optional<Person> maxAge = people.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));
        System.out.println("The oldest is: " + maxAge.get());

        // Summarizing the stream
        // result: IntSummaryStatistics{count=4, sum=172, min=15, average=43.000000, max=90}
        IntSummaryStatistics summaryStatistics = people.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Summary: " + summaryStatistics);

        // Joining the names
        // spider man, captain america, iron man, winter soldier
        String names = people.stream().map(Person::getName).collect(Collectors.joining(", "));
        System.out.println("Names: " + names);

        // pre- spider man, captain america, iron man, winter soldier -suf
        String namesPreSuffix = people.stream().map(Person::getName).collect(Collectors.joining(", ", "pre- ", " -suf"));
        System.out.println("Names: " + namesPreSuffix);

    }

}
