import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 3;
        boolean NumberIsPrime = true;
        System.out.println("cac so nguyen to duoi 100 la 2");
        while (number < 100) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    NumberIsPrime = false;
                    break;
                }
            }
            if (NumberIsPrime) {
                System.out.println("cac so nguyen to duoi 100 la "  + number);
                number++;
            } else {
                NumberIsPrime = true;
                number++;
            }
        }
    }
}
