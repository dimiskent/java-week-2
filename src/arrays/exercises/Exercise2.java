package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        int[][] numbers = {
                {1, 3, 5},
                {2, 4, 6}
        };
        int sum = 0;
        int interval = 1;
        for(int[] numberArray : numbers) {
            System.out.println("Processing array " + interval++);
            for(int number : numberArray) {
                sum += number;
                System.out.println(number);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
