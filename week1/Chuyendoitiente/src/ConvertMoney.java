import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Gia tri VND: " + quydoi);
    }
}
