package dev.rolasnajera.lambdas;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> increment = n -> n + 10;
        Function<Integer, Integer> multiply = m -> m * 2;

        System.out.println("compose result: " + increment.compose(multiply).apply(3));

    }

}
