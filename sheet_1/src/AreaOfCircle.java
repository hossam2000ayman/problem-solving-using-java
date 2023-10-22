import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        if(R >= 1 && R <= 100){
            double area = Math.PI * Math.pow(R,2);
            DecimalFormat decimalFormat = new DecimalFormat("0.000000000");
            String formattedArea = decimalFormat.format(area);
            System.out.println(formattedArea);
        }
    }
}