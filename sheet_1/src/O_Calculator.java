import java.util.Scanner;
public class O_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split("[+\\-*/]");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        char operator = input.charAt(parts[0].length());

        int result = 0;

        switch (operator){
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = Math.round(a / b);
                break;
        }

        System.out.println(result);

    }
}
