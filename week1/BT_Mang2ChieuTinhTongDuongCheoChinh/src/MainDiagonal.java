import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao bac cua ma tran: ");
        n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("nhap gia tri vao vi tri " + i + " " + j + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma tran vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh la: " + sum);
    }
}
