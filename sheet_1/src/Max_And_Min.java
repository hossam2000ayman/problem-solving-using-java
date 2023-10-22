import java.util.Scanner;
public class Max_And_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long greatestNumber = Math.max(Math.max(a,b),c);
        long smallestNumber = Math.min(Math.min(a,b),c);

        System.out.println(smallestNumber+ " " + greatestNumber);
    }
}
