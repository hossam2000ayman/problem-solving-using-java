import java.util.Scanner;

public class Mathematical_Expression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        String q = scanner.next();
        int c = scanner.nextInt();
        if (q.equals("=")) {
            if (s.equals("+")) {
                if ((a + b) == c) {
                    System.out.println("Yes");
                } else {
                    System.out.println(a + b);
                }
            } else if (s.equals("-")) {
                if ((a - b) == c) {
                    System.out.println("Yes");
                } else {
                    System.out.println(a - b);
                }
            } else if (s.equals("*")) {
                if ((a * b) == c) {
                    System.out.println("Yes");
                } else {
                    System.out.println(a * b);
                }
            }
        }


    }
}
