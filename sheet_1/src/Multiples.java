import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if(a % b == 0 || b % a == 0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }

    }
}
