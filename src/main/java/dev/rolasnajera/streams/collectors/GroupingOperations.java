package dev.rolasnajera.streams.collectors;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingOperations {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15, "Germany"));
        people.add(new Person("captain america", 90, "USA"));
        people.add(new Person("iron man", 38, "USA"));
        people.add(new Person("winter soldier", 29, "Germany"));
        people.add(new Person("winter soldier", 29, "Germany"));
        // Grouping by country
        // result: {USA=[Person{name: 'captain america', age: 90}, Person{name: 'iron man', age: 38}], Germany=[Person{name: 'spider man', age: 15}, Person{name: 'winter soldier', age: 29}, Person{name: 'winter soldier', age: 29}]}
            Map<String, List<Person>> groupByCountry = people.stream().collect(Collectors.groupingBy(Person::getCountry));
        System.out.println(groupByCountry);

        // When having Set
        // result: {USA=[Person{name: 'iron man', age: 38}, Person{name: 'captain america', age: 90}], Germany=[Person{name: 'winter soldier', age: 29}, Person{name: 'spider man', age: 15}]}
        Map<String, Set<Person>> groupByCountrySet = people.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.toSet()));
        System.out.println(groupByCountrySet);

        // Including another grouping (by summing age for example)
        // result: Sum of ages: {USA=128, Germany=73}
        Map<String, Integer> summingAgeByCountry = people.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.summingInt(Person::getAge)));
        System.out.println("Sum of ages: " + summingAgeByCountry);

        // groupingByConcurrent using parallel stream

        ConcurrentMap<String, List<Person>> concurrentMapPerson = people.parallelStream().collect(
                Collectors.groupingByConcurrent(Person::getCountry));
        System.out.println(concurrentMapPerson);

        // partitioning
        // {false=[Person{name: 'spider man', age: 15}, Person{name: 'winter soldier', age: 29}, Person{name: 'winter soldier', age: 29}],
        // true=[Person{name: 'captain america', age: 90}, Person{name: 'iron man', age: 38}]}
        Map<Boolean, List<Person>> youngAndAdults = people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 30));
        System.out.println("youngest and Adults > 30: " + youngAndAdults);

    }

}
