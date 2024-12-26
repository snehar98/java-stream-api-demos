package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// * Given a list of integers, filter out the odd numbers using Streams - return even numbers
public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);

        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
         //.collect(Collectors.toList());

        System.out.println("Even Numebrs are : "+result);
    }
}