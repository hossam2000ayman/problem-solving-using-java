import java.util.Scanner;


import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("floor "+ (int) a + " / " + (int) b + " = " + (int) Math.floor(a/b));
        System.out.println("ceil "+ (int) a + " / " + (int) b + " = " + (int) Math.ceil(a/b));
        System.out.println("round "+ (int) a + " / " + (int) b + " = " + (int) Math.round(a/b));
    }
}
