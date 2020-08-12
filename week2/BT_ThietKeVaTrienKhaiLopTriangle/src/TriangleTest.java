import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap color: ");
        String color = scanner.nextLine();
        System.out.print("nhap side1: ");
        double s1 = scanner.nextDouble();
        System.out.print("nhap side2: ");
        double s2 = scanner.nextDouble();
        System.out.print("nhap side3: ");
        double s3 = scanner.nextDouble();


        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(color, s1, s2, s3);
        System.out.println(triangle1);
    }

}
