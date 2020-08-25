import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap x: ");
        int x = scanner.nextInt();
        System.out.print("nhap y: ");
        int y = scanner.nextInt();

        CalculationExample cal = new CalculationExample();
        cal.calculator(x, y);

    }

    public static void calculator(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int multi = x * y;
            int div = x / y;
            System.out.println("sum: " + sum);
            System.out.println("sub: " + sub);
            System.out.println("multi: " + multi);
            System.out.println("div: " + div);

        } catch (Exception e) {
            System.out.println("loi " + e.getMessage());
        } finally {
            System.out.println("ket thuc thuat toan");
        }
    }
}
