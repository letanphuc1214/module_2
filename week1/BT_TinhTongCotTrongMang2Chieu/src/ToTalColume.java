import java.util.Scanner;

public class ToTalColume {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so hang: ");
        int row = scanner.nextInt();
        System.out.print("nhap vao so cot: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap gia tri vao vi tri " + i + " " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("nhap cot can tinh tong: ");
        int b = scanner.nextInt();
        tinhCot(b, array);

    }

    public static void tinhCot(int i, int[][] arrnew) {
        i = i - 1;
        int sum = 0;
        for (int j = 0; j < arrnew.length; j++) {
            sum = sum + arrnew[j][i];
        }
        System.out.println("Tong cot " + (i + 1) + " la:" + sum);
    }
}

