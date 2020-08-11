
import java.text.DecimalFormat;
import java.util.Scanner;
public class Body {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        System.out.println("Your Weight");
        weight = scanner.nextDouble();
        System.out.println("Your Height");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi" + " " + "Interpretation");

        if (bmi < 18.5)
            System.out.println(decimalFormat.format(bmi) + " " + "underweight");
        else if (bmi < 25.0)
            System.out.println(decimalFormat.format(bmi) + " " + "Normal");
        else if (bmi < 30.0)
            System.out.println(decimalFormat.format(bmi) + " " + "Overweight");
        else
            System.out.println("Obese");
    }
}
