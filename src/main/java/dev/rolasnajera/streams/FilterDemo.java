package dev.rolasnajera.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {

        // list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        numbers.stream()
                .filter(num -> num > 30)
                .forEach(System.out::println);
        System.out.println("Original list");
        numbers.forEach(num -> System.out.println(num));


    }

}
