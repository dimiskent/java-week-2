package arrays.exercises;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
import java.util.Scanner;
public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {2, 64, 32, 16, 128, 8, 4};
        int numberToSearch;
        while (true) {
            System.out.print("Enter a whole number to search: ");
            if(scanner.hasNextInt()) {
                numberToSearch = scanner.nextInt();
                break;
            } else {
                scanner.next();
                System.out.println("Please input a whole number!!!");
            }
        }
        int index = arrayIndex(numbers, numberToSearch);
        if(index < 0) {
            System.out.println(numberToSearch + " wasn't found on the array");
        } else {
            System.out.println("Number found at index " + index);
        }
    }
    // Searches on an array for a number match. Array doesn't need to be sorted!
    // Either returns the index position or -1 (not found)
    private static int arrayIndex(int[] numbers, int search) {
        for(int index = 0; index < numbers.length; index++) {
            if(search == numbers[index]) return index;
        }
        return -1;
    }
}
