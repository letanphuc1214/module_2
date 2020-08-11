import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        double a = scanner.nextDouble();
        System.out.println(" ");
        System.out.print("nhap gia tri b: ");
        double b = scanner.nextDouble();
        System.out.println(" ");
        System.out.print("nhap gia tri c: ");
        double c = scanner.nextDouble();
        System.out.println(" ");
        QuadraticEquation solve = new QuadraticEquation(a, b, c);
        if (solve.getDiscriminant() == 0){
            System.out.println("phuong trinh co nghiem kep la: " + solve.getRoot1_2());
        }
        else if (solve.getDiscriminant() > 0 ){
            System.out.println("Nghiem cua phuong trinh la: " + solve.getRoot1() + " va " + solve.getRoot2());
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
