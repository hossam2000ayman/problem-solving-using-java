import java.util.Scanner;
public class SayHelloWithJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();

        System.out.println("Hello, "+name);
    }
}
