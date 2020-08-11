import java.util.Arrays;
import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args) {
//        int[] array = {7, 5, 8, 9, 3, 6, 1};
//        System.out.println("Ta co mang la: " + Arrays.toString(array));
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap vao do dai mang: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("do dai mang khong duoc qua 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print(" nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("phan tu trong mang la: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.print("nhap phan tu can chen: ");
        int x = scanner.nextInt();
        System.out.print("nhap vi tri can chen vao trong mang: ");
        int index = scanner.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("phan tu chua duoc chen");
        } else {
            int[] arrayNew = new int[array.length + 1];
            for (int j = 0; j < index; j++){
                arrayNew[j] = array[j];
            }
            arrayNew[index] = x;
            for (int j = index + 1; j <= array.length; j++ ){
                arrayNew[j] = array[j - 1];
            }

            System.out.println("mang da duoc chen la: " + Arrays.toString(arrayNew));

        }


//        int x = 0;
//        int index = 0;
//        insert(array, x, index);


//    public static void insert(int[] array, int x, int index) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap phan tu can chen: ");
//        x = scanner.nextInt();
//        System.out.print("nhap vi tri index can chen vao trong mang: ");
//        index = scanner.nextInt();
//        if (index < 0 || index > array.length){
//            System.out.println("phan tu chua duoc chen vao mang");
//        }
//        else {
//            int[] arrayNew = new int[array.length + 1];
//            for (int i = 0; i < index; i++) {
//                arrayNew[i] = array[i];
//            }
//            arrayNew[index] = x;
//            for (int i = index + 1; i <= array.length; i++) {
//                arrayNew[i] = array[i - 1];
//            }
//            System.out.println("mang da duoc chen la: " + Arrays.toString(arrayNew));
//        }
    }
}
