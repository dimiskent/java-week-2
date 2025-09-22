package arrays.exercises;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {2, 64, 32, 16, 128, 8, 4};
        Arrays.sort(numbers);
        int search;
        while (true) {
            System.out.print("Enter a number to search: ");
            if(scanner.hasNextInt()) {
                search = scanner.nextInt();
                break;
            } else {
                scanner.next();
                System.out.println("Please enter a whole number!");
            }
        }
        int index = Arrays.binarySearch(numbers, search);
        if(index < 0) {
            System.out.println("Not found!");
        } else {
            System.out.printf("%d was found at index %d!", search, index);
        }
    }
}
