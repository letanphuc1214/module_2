import java.util.Scanner;

public class TryCatchTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        while (!check) {
            try {
                System.out.print(" nhap canh a: ");
                int sideA = scanner.nextInt();
                System.out.print(" nhap canh b: ");
                int sideB = scanner.nextInt();
                System.out.print(" nhap canh c: ");
                int sideC = scanner.nextInt();
                if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                    throw new ArithmeticException("Canh phai la 1 so nguyen duong");
                } else if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
                    throw new ArithmeticException("Tong hai canh phai lon hon canh con lai");
                } else {
                    System.out.println("canh a: " + sideA);
                    System.out.println("canh b: " + sideB);
                    System.out.println("canh c: " + sideC);
                    System.out.println("Do dai 3 canh la: " + sideA + sideB + sideC);
                    check = true;
                }
            } catch (ArithmeticException e) {
                System.out.println("!Warning" + e.getMessage());
            } catch (Exception e) {
                System.out.println("Loi roi ban oi");
            }

        }

    }
}
