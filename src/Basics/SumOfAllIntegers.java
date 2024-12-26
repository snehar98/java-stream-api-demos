package Basics;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, write a Stream operation to calculate their sum.
public class SumOfAllIntegers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);

        int result = numbers.stream()
                .mapToInt(Integer::intValue) // COnvert the elements to primitive int -> int stream
                .sum(); //add all the elements

        System.out.println("The sum is : "+result);
    }
}
