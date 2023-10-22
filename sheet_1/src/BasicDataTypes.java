import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated input
        int myInt = scanner.nextInt();
        long myLong = scanner.nextLong();
        char myChar = scanner.next().charAt(0);
        float myFloat = scanner.nextFloat();
        double myDouble = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Print each element on a new line
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myChar);
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
}