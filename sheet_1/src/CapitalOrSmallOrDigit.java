import java.util.Scanner;
public class CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x = scanner.next().charAt(0);

        if(Character.isDigit(x)){
            System.out.println("IS DIGIT");
        }else{
            System.out.println("ALPHA");
            if(Character.isUpperCase(x)){
                System.out.println("IS CAPITAL");
            }else {
                System.out.println("IS SMALL");
            }
        }
    }
}
