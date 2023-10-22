import java.util.Arrays;
import java.util.Scanner;


public class SortNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three numbers
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        // Create an array to store the numbers
        int[] numbers = {A, B, C};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted numbers
        for (int num : numbers) {
            System.out.println(num);
        }

        // Print a blank line
        System.out.println();

        // Print the numbers in the sequence they were read
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}

