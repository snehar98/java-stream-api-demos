package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Using the Stream API, find the average of a list of integers.
public class AvergaeOfIntegers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);

        OptionalDouble result = numbers.stream()
                .mapToInt(Integer::intValue)// COnvert the elements to primitive int -> int stream
                .average(); //add all the elements

       result.ifPresentOrElse(avg -> System.out.println("The average is : "+avg),
               () -> System.out.println("Empty List"));
    }
}
