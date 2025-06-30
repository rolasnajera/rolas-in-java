package dev.rolasnajera.collections.improvements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("Oranges", "Grapes", "Lemons", "Bananas", "Apples"));
        Iterator<String> iterator = fruits.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Improvement in Java8
        System.out.println("----------- Using new forEachRemaining() method --------------");
        List<String> fruit = new ArrayList<>(Arrays.asList("Orange", "Grape", "Lemon", "Banana", "Apple"));
        Iterator<String> it = fruit.iterator();
        it.forEachRemaining(System.out::println);


    }

}
