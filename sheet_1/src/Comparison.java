import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String symbol = scanner.next();
        int b = scanner.nextInt();

        if (symbol.equals(">")) {
            if (a > b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (symbol.equals("=")) {
            if (a == b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (symbol.equals("<")) {
            if (a < b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
