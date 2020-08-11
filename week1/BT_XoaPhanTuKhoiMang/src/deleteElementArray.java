import java.util.Arrays;
import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        int[] array = {5,8,7,6,2,9,3,4};
        System.out.println("Ta co mang la: " + Arrays.toString(array));
        int x = 0;
        delete(array, x);
    }

    public static void delete(int[] array, int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap phan tu can xoa: ");
        x = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                check = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        if (check == false){
            System.out.println("khong co phan tu trong mang");
        }
        else {
            System.out.println("Ta co mang da xoa la: " + Arrays.toString(array));
        }


    }

}
