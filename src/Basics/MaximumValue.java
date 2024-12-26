package Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Write a Stream code to find the maximum value from a list of integers.
public class MaximumValue {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);

        /* find the maximum element
        other approach .max((a,b) -> a.compareTo(b)); */
        Optional<Integer> result = numbers.stream()
                .max(Comparator.naturalOrder());

        result.ifPresentOrElse(number -> System.out.println("The maximum value is : " + number),
                () -> System.out.println("The List is Empty"));
    }
}