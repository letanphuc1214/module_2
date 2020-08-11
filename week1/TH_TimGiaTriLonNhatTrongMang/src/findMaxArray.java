import java.util.Scanner;

public class findMaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap vao do dai mang: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("do dai mang khong qua 20 phan tu");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap phan tu thu " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Cac phan tu trong mang la: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int max = array[0];
        int index = 1;
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: " + max + " o vi tri thu " + (index+1));
    }
}
