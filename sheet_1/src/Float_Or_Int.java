import java.util.Scanner;
public class Float_Or_Int {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();

        int integerPart = (int) N;
        double decimalPart = N - integerPart;

        if (decimalPart == 0) {
            System.out.println("int " + integerPart);
        } else {
            System.out.println("float " + integerPart + " " + decimalPart);
        }
    }
}

