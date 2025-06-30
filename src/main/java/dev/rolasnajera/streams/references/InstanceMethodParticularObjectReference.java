package dev.rolasnajera.streams.references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceMethodParticularObjectReference {

    public int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charly", "David", "Elena"));
        InstanceMethodParticularObjectReference instance = new InstanceMethodParticularObjectReference();

        list.stream()
                .mapToInt(instance::getLength)
                .forEach(System.out::println);

    }

}
