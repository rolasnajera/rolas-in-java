package dev.rolasnajera.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
       Person testPerson = new Person();
        UnaryOperator<Person>  operator = p -> {
            p.name = "Rolas";
            p.age = 36;
            return p;
        };

        operator.apply(testPerson);
        System.out.println("Person name: " + testPerson.getName() + " and age: " + testPerson.getAge());

    }

}
