import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int number = 3;
        boolean SoNguyenTo = true;
        System.out.println("so nguyen to thu 1 la 2");
        while (count < 20){
            for (byte i = 2; i < number; i++){
                if (number % i == 0) {
                    SoNguyenTo = false;
                    break;
                };
            }
            if (SoNguyenTo){
                count++;
                System.out.println("so nguyen to thu " + count + " la " + number);
                number++;
            }
            else {
                SoNguyenTo = true;
                number++;
            }
        }




    }
}
