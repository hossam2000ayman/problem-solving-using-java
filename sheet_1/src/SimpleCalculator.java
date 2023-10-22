import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int firstNumber = S.nextInt();
        int secondNumber = S.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (long)firstNumber * secondNumber); // Use 'long' to prevent overflow
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }
}