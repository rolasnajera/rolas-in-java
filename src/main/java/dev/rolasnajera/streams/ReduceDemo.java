package dev.rolasnajera.streams;

import dev.rolasnajera.Person;
import java.util.*;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        Optional<Integer> total = people.stream().map(Person::getAge).reduce(Integer::sum);
        System.out.println("Total is: " + total.get());

        OptionalInt totalAge = people.stream().mapToInt(Person::getAge)
                .reduce(Integer::sum);

        System.out.println("Total age is: " + totalAge.getAsInt());

        // Experimenting with names
        Optional<String> allNames = people.stream().map(Person::getName).reduce(String::concat);
        System.out.println("All names are: " + allNames.get());

        // reduce with identity
        //In the below example, we provide five as an identity. If the stream is empty, five will be returned.
        // If the stream is not empty, five will be added to the sum.
        int totalSum = people.stream().map(Person::getAge)
                .reduce(5, Integer::sum);
        // When printing is 5 added to the total sum
        System.out.println(totalSum);

        // When using parallel stream, requires a combiner
        int totalSumParallel = people.parallelStream().map(Person::getAge)
                .reduce(0, Integer::sum, Integer::sum);
        System.out.println(totalSumParallel);

        // Get oldest and youngest

        Optional<Integer> oldestAvenger = people.stream().map(Person::getAge).max(Comparator.naturalOrder());
        oldestAvenger.ifPresent(age -> System.out.println("Oldest avenger with age of: " + age));

        Optional<Integer> youngestAvenger = people.stream().map(Person::getAge).min(Comparator.naturalOrder());
        youngestAvenger.ifPresent(age -> System.out.println("Youngest avenger with age of: " + age));


    }

}
