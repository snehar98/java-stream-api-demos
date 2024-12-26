package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Use Streams to check if there is any number greater than a given threshold in a list.
public class IntegerGreaterThanThreshold {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);
        int threshold = 7;

        List<Integer> result = numbers.stream()
                .filter(num -> num > threshold)
                .toList();

        System.out.println("Available numbers greater than "+threshold+" : "+result);

    }
}