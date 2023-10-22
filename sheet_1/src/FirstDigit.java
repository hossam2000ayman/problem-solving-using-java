import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        char firstDigit = number.charAt(0);

        if(Character.isDigit(firstDigit)){
            if( Character.getNumericValue(firstDigit) % 2 == 0){
                System.out.println("EVEN");
            }else {
                System.out.println("ODD");
            }
        }
    }

}
