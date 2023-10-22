import java.util.Scanner;

public class SummationFrom1ToN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long sum = (number * (number + 1)) / 2;
        System.out.println(sum);

    }
}
