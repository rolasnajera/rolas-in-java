package dev.rolasnajera.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEvaluationDemo {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Optional<Integer> number = data.stream()
                .filter(num -> {
                    System.out.println("First filter on number: " + num);
                    return num > 5;
                })
                .filter(num -> {
                    System.out.println("Second filter on number: " + num);
                    return num % 3 == 0;
                })
                .findFirst();

        number.ifPresent(System.out::println);

    }

}
