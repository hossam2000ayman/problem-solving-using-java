import java.util.Scanner;
public class N_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        if(Character.isUpperCase(x)){
            System.out.println(Character.toLowerCase(x));
        }else{
            System.out.println(Character.toUpperCase(x));
        }
    }
}
