import java.util.Scanner;
public class LinearEquationResolvers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double answer = -b / a;
            System.out.println("Equation pass width x" + answer);
        }
        else if (b == 0){
                System.out.println("The solution is  all x!");
            }else {
            System.out.println("no solution!");
        }
    }
}
