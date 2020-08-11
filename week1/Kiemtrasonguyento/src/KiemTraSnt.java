import java.util.Scanner;

public class KiemTraSnt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen: ");
        int snt = scanner.nextInt();

        if (snt < 2){
            System.out.println(snt + " khong phai la so nguyen to");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i < snt ){
                if (snt % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(snt + " la so nguyen to");
            }
            else {
                System.out.println(snt + " khong phai la so nguyen to");
            }
        }

    }
}
