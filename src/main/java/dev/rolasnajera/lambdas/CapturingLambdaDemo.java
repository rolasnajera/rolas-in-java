package dev.rolasnajera.lambdas;

import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {

    public static void main(String[] args) {
        int i = 5; // effectively final


        UnaryOperator<Integer> operator = input -> input * i;
        System.out.println(operator.apply(i));

        int j = 7;
        // Uncomment the following line to see the compilation error of not an effectively final variable
        // j = 7;
        UnaryOperator<Integer> operatorNonFinal = input -> input * j;
        System.out.println(operatorNonFinal.apply(j));
    }

}
