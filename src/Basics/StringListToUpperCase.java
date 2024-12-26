package Basics;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, convert all the strings to uppercase using Stream operations.
public class StringListToUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> result = strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("List with Upper Case strings : "+result);

    }
}