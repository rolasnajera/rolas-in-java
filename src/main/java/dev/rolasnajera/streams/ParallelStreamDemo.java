package dev.rolasnajera.streams;

import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        System.out.println("------------------Serial stream -----------------");
        Stream.of(1,2,3,4,5,6,7)
                .forEach(num -> System.out.println(num + " - " + Thread.currentThread().getName()));

        System.out.println("------------------Parallel stream -----------------");
        Stream.of(1,2,3,4,5,6,7)
                .parallel()
                .forEach(num -> System.out.println(num + " - " + Thread.currentThread().getName()));


    }
}
