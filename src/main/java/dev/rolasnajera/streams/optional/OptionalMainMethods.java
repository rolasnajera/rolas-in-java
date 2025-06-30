package dev.rolasnajera.streams.optional;

import dev.rolasnajera.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMainMethods {

    Map<Integer, Person> empMap = new HashMap<>();

    Optional<Person> getOptionalPerson(Integer personId) {
        return Optional.ofNullable(empMap.get(personId));
    }

    void populatePerson() {
        empMap.put(1452, new Person("Tony", 36));
    }

    static String defaultString() {
        return "Default string";
    }

    public static void main(String[] args) {
        OptionalMainMethods optionalMainMethods = new OptionalMainMethods();
        Optional<Person> isNotPresentPerson = optionalMainMethods.getOptionalPerson(1452);

        // isPresent method
        if(isNotPresentPerson.isPresent()) {
            System.out.println("Person exists" + isNotPresentPerson.get());
        } else {
            System.out.println("Person not found");
        }

        // ifPresent(Consumer<? super T> consumer)
        isNotPresentPerson.ifPresent(System.out::println);

        optionalMainMethods.populatePerson();
        Optional<Person> ifPresentPerson = optionalMainMethods.getOptionalPerson(1452);
        ifPresentPerson.ifPresent(System.out::println);

        // get() the following throws exception because there is no value
        //System.out.println(isNotPresentPerson.get());

        ifPresentPerson.ifPresent(System.out::println);

        // orElse example
        Optional<String> empty =  Optional.empty();
        System.out.println(empty.orElse("Empty String"));

        // orElseGet use the supplier as the example below
        System.out.println(empty.orElseGet(OptionalMainMethods::defaultString));

        // orElseThrow throws an exception if not present
        try {
            empty.orElseThrow(() -> new Exception("Is empty"));
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
