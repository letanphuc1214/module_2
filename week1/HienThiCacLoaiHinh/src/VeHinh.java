import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        byte choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ve hinh chu nhat");
        System.out.println("2. Ve hinh tam giac vuong co goc vuong o bottom-left");
        System.out.println("3. Ve hinh tam giac vuong co goc vuong o top-left");
        System.out.println("0. exit");
        choice = input.nextByte();

        switch (choice) {
            case 1:
                for (byte i = 0; i < 3; i++) {
                    for (byte j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                for (byte i = 1; i <= 5; i++) {
                    for (byte j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;

            case 3:
                for (byte i = 5; i >= 1; i--) {
                    for (byte j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("no choice");
        }

    }
}
