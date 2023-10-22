import java.util.Scanner;

public class The_last_2_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        // Calculate the product
        int product = (A % 100) * (B % 100) * (C % 100) * (D % 100);

        // Extract the last 2 digits
        int lastTwoDigits = (product % 100);
        if (lastTwoDigits < 10) {
            System.out.println("0" + lastTwoDigits);
        } else {
            System.out.println(lastTwoDigits);
        }
    }
}
