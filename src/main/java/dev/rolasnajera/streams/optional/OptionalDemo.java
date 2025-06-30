package dev.rolasnajera.streams.optional;

import dev.rolasnajera.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {

    Map<Integer, Person> empMap = new HashMap<>();

    Person getPerson(Integer personId) {
        return empMap.get(personId);
    }

    Optional<Person> getOptionalPerson(Integer personId) {
        return Optional.ofNullable(empMap.get(personId));
    }

    public static void main(String[] args) {
        OptionalDemo optionalDemo = new OptionalDemo();
        Person person = optionalDemo.getPerson(1245);

        // The following line throws an Null pointer exception
        System.out.println(person);

        Optional<Person> optionalPerson = optionalDemo.getOptionalPerson(1452);

        // Checking if null
        if(optionalPerson.isPresent()) {
            System.out.println("Person exists" + optionalPerson.get());
        } else {
            System.out.println("Person not found");
        }


    }

}
