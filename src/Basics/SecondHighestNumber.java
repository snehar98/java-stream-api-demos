package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Using Streams, find the second highest number in a list of integers
public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 3, 2, 4, 8, 1, 9, 10, -4, 0);

        //Optional to handle NPEs
        Optional<Integer> result = numbers.stream() //Convert the list to stream
                .distinct() //Find Unique elements
                .sorted((a,b) -> b.compareTo(a)) //Sort in descending order
                .skip(1) //Skip 1 element
                .findFirst(); //Select the first element from remaining stream elements

        result.ifPresentOrElse(number -> System.out.println("Second Highest Number is : " + number),
                () -> System.out.println("The list does not have enough distinct elements.")
        );
    }
}
