package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4
{
    public static void main(String[] args)
    {
        int[] numbers = { 61, 52, 99, 69, 42, 67 };
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(numbers));

        int[] clone = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy of number => clone");
        System.out.println(Arrays.toString(clone));

        int keyNumber = 42;
        int search = Arrays.binarySearch(numbers, keyNumber); // NOTE: always sort before
        if(search < 0) { // in case the key isn't found (returns negative value)
            System.out.println("Key not found");
        } else {
            System.out.printf("%d found. Index: %d\n", keyNumber, search);
        }

        // not equal array
        int[] differentNumbers = { 61, 63, 65, 67, 69, 71 };
        boolean matches1, matches2;
        matches1 = Arrays.equals(numbers, clone);
        matches2 = Arrays.equals(numbers, differentNumbers);
        System.out.println("Match test with numbers and clone: " + matches1);
        System.out.println("Match test with numbers and a different array of 6 numbers: " + matches2);
    }
}

