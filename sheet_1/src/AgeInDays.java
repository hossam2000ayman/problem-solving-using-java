import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();
        int years = (int) Math.floor((double) numberOfDays / 365);

        int months = (int) Math.floor((double) (numberOfDays - (years * 365)) / 30);

        int days = numberOfDays - (months * 30) - (years * 365);


        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

    }
}
