import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap vao do dai cua mang: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("do dai cua mang phai duoi 20 phan tu");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("nhap phan tu thu " + (i + 1) + " cua mang: ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Mang co cac phan tu la:");
        for (i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        int min = array[0];
        for (i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.print("Phan tu be nhat trong mang la: " + min);
    }
}
