import java.util.Scanner;

public class DigitSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();

        long firstNumberDigit = firstNumber % 10; //get the last digit in the number
        long secondNumberDigit = secondNumber % 10;

        long sum = firstNumberDigit + secondNumberDigit;
        System.out.println(sum);
    }
}
