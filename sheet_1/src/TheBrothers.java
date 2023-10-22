
import java.util.Scanner;

public class TheBrothers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName1 = scanner.next();
        String secondName1 = scanner.next();
        String firstName2 = scanner.next();
        String secondName2 = scanner.next();

        if(secondName1.equals(secondName2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }
    }
}
