import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner(System.in);

//      kiem tra va nhap vao mang 1
        do {
            System.out.print("nhap vao do dai cua mang1 : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("do dai cua mang khong qua 20");
            }
        } while (size > 20);
        array1 = new int[size];
        int i = 0;
        while (i < array1.length) {
            System.out.print("nhap phan tu thu " + (i + 1) + " mang 1: ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("phan tu trong mang 1 la: ");
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");

//      kiem tra va nhap vao mang 2
        do {
            System.out.print("nhap vao do dai cua mang 2: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("do dai cua mang khong qua 20");
            }
        } while (size > 20);
        array2 = new int[size];
        int j = 0;
        while (j < array2.length) {
            System.out.print("nhap phan tu thu " + (j + 1) + " mang 2: ");
            array2[j] = scanner.nextInt();
            j++;
        }
        System.out.print("phan tu trong mang 2 la: ");
        for (j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
        System.out.println(" ");

//        tao array 3 de chua phan tu mang 1 va mang 2
        int[] array3 = new int[array1.length + array2.length];
        int count = 0;
        for (i = 0; i < array1.length; i++){
            array3[i] = array1[i];
            count++;
        }
        for (j = 0; j < array2.length; j++){
            array3[count++] = array2[j];
        }
        System.out.print("ta co mang sau khi gop la: ");
        for (int k = 0; k < array3.length; k++){
            System.out.print(array3[k] + " ");
        }
    }


}
