package dev.rolasnajera.collections.improvements;

import java.util.HashMap;
import java.util.Map;

public class MapUpgrades {

    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 20);

        //The following line throw an error if the "banana" key does not exist
        //fruits.put("banana", fruits.get("banana") + 20)

        if(fruits.containsKey("banana")) {
            fruits.put("banana", fruits.get("banana") + 20);
        } else {
            fruits.put("banana", 20);
        }

        // now we can use the new method getOrDefault()
        fruits.put("Grape", fruits.getOrDefault("grape", 0)+20);
        System.out.println(fruits);

        // we can use ifAbsent to create new key and value
        fruits.putIfAbsent("orange", 2);
        // The following is not added
        fruits.putIfAbsent("apple", 10);
        System.out.println(fruits);

        // we can use compute to make operations only if exists
        int result = fruits.compute("apple", (k, v) -> v + 10);
        System.out.println("Compute result: " + result);
        // the following line throw an exception
        //int pears = fruits.compute("pear", (k, v) -> v + 10);

        // Using foreach in Map (added in Java8)
        fruits.forEach((k, v) -> System.out.println("Key: " + k + " - value: " + v));

        // replace() method
        fruits.replace("banana", 15);
        System.out.println(fruits.get("banana"));

        fruits.replace("apple", 30, 60);
        System.out.println(fruits.get("apple"));

        fruits.replaceAll((k, v) -> 1);
        System.out.println(fruits);

        // remove by key
        fruits.remove("apple");

        // remove by key if the value is equal
        fruits.remove("banana", 1);
        fruits.remove("orange", 10);
        System.out.println(fruits);


    }

}
