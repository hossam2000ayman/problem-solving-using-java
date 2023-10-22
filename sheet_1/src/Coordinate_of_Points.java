import java.util.Scanner;

public class Coordinate_of_Points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num1 != 0 && num2 == 0) {
            System.out.println("Eixo X");
        } else if (num2 != 0 && num1 == 0) {
            System.out.println("Eixo Y");
        } else if (num1 == 0 && num2 == 0) {
            System.out.println("Origem");
        } else if (num1 > 0 && num2 > 0) {
            System.out.println("Q1");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println("Q4");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("Q2");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Q3");
        }
    }
}
