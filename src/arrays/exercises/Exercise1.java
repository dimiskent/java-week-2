package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array
 * TODO:
 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        int[] numbers = { 2, 4, 7, 9, 18 };
        int sum = 0;
        for(int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
