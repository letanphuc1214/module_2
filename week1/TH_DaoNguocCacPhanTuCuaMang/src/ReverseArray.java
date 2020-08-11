import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap do dai cua mang: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("do dai mang khong qua 20");
            }
        }while (size > 20);

        array = new int[size];
        System.out.println();
        int i = 0;
        while (i < array.length){
            System.out.print("nhap phan tu " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("phan tu trong mang la: ");
        for (i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        for (i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("");
        System.out.print("mang duoc dao nguoc la: ");
        for (i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
