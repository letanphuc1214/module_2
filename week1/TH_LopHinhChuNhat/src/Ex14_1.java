import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        double width = scanner.nextDouble();
        System.out.print("nhap chieu rong: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimeter());
        System.out.println("Hinh chu nhat: " + rectangle.display());

    }
}
