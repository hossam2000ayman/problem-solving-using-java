import java.util.Scanner;

public class Two_intervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l1 = scanner.nextLong();
        long r1 = scanner.nextLong();
        long l2 = scanner.nextLong();
        long r2 = scanner.nextLong();

        long intersectionStart = Math.max(l1, l2);
        long intersectionEnd = Math.min(r1, r2);

        if (intersectionStart <= intersectionEnd) {
            System.out.println(intersectionStart + " " + intersectionEnd);
        } else {
            System.out.println(-1);
        }
    }
}

