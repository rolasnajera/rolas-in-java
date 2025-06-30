package dev.rolasnajera.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamDemo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        List<String> names = new ArrayList<>();
        names.add("Thor");
        names.add("Tony");
        names.add("Steve");
        names.add("Natasha");
        names.add("Bannon");
        names.add("Fury");

        Stream<String> streamNames = names.stream();
        streamNames.forEach(name -> System.out.println(name));

    }

}
