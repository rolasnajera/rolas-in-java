package dev.rolasnajera.streams;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("spider man", 15));
        people.add(new Person("captain america", 90));
        people.add(new Person("iron man", 38));
        people.add(new Person("winter soldier", 29));

        boolean anyIronMan = people.stream().anyMatch(p -> "iron man".equals(p.getName()));
        if(anyIronMan) System.out.println("There is an Iron man in Avengers");

        boolean allAdults = people.stream().allMatch(p -> p.getAge() >= 18);
        if(allAdults) System.out.println("Everyone is adult :)");
        else System.out.println("Not everyone is adult :(");

        boolean noneAlien = people.stream().noneMatch(p -> p.getAge() >= 100);
        if(noneAlien) System.out.println("There is no alien with more than 100 years");
        else System.out.println("There is an alien with more than 100 years.");

    }

}
