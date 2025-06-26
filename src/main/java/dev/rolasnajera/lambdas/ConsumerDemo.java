package dev.rolasnajera.lambdas;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello, World!");

        Consumer<Integer>  integerConsumer = i -> System.out.println("Value = " + i);
        integerConsumer.accept(12);

        Consumer<String> nameConsumer = s -> System.out.println("My name is: " + s);
        Consumer<String> ageConsumer = i -> System.out.println(" and my age is: " + i);

        nameConsumer.andThen(ageConsumer).accept("Rolas");

    }

}
