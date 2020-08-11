import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap do dai:  ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("do dai khong duoc qua 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("nhap diem cho hoc sinh thu " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sach diem: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
            if (array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println(" ");
        System.out.print("So hoc sinh thi do la: " + count);

    }
}
