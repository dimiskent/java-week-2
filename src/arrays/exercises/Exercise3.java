package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * TODO:
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2, 3};
        jagged[1] = new int[]{4, 5, 6, 7, 9};
        jagged[2] = new int[]{10};
        int sum = 0;
        for(int[] arrays : jagged) {
            for(int number : arrays) {
                sum += number;
                System.out.println(number);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
