package dev.rolasnajera.lambdas;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {
        Person person1 = new Person("John", 37);
        Person person2 = new Person();
        BinaryOperator<Person> operator = (p1, p2) -> {
            p2.setName(p1.getName() + " copy");
            p2.setAge(p1.getAge() + 1);
            return p2;
        };
        operator.apply(person1, person2);
        System.out.println("Person 2 name: " + person2.getName() + " and age: " + person2.getAge());
    }

}
