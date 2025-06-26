package dev.rolasnajera.lambdas;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {

    static boolean isPersonEligibleForADrink(Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Rolas", 18);
        IntSupplier intSupplier = () -> (int)(Math.random() * 10);
        // before using a random supplier the lambda was to validate to be greater than 18
        //Predicate<Person> predicate = p -> p.age >= 18;
        Predicate<Person> predicate = p -> p.age >= intSupplier.getAsInt();

        if(PredicateDemo.isPersonEligibleForADrink(supplier, predicate))
            System.out.println("Yep, take a drink!");
        else
            System.out.println("Nop, go home!");

    }

}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}