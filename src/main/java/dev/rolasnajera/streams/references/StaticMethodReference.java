package dev.rolasnajera.streams.references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {

    public static int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charly", "David", "Elena"));
        list.stream()
                .mapToInt(StaticMethodReference::getLength)
                .forEach(System.out::println);

    }

}
