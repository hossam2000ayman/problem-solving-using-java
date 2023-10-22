import java.util.Scanner;

public class Hard_Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        double z = Math.log(a)  * b;
        double y = Math.log(c) * d;

        if(z > y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
