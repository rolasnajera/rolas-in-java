package dev.rolasnajera.streams.references;

import dev.rolasnajera.Person;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodArbitraryObjectReference {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Tony", 36));
        list.add(new Person("Steve", 45));
        list.add(new Person("Thor", 38));
        list.add(new Person("Dr. Johns", 25));
        list.add(new Person("Natasha", 26));

        // Code without using method reference
        int ageSum = list.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println("Age sum: " + ageSum);

        // Code using method reference
        int totalAge = list.stream().mapToInt(Person::getAge).sum();
        System.out.println("Age sum: " + totalAge);



    }

}
