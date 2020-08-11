import java.util.Scanner;

public class FindMaxTwoDimensionalArray {
    public static void main(String[] args){
        int column;
        int row;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so dong cua ma tran: ");
        row = scanner.nextInt();
        System.out.print("nhap vao so cot cua ma tran: ");
        column = scanner.nextInt();

        int matrix[][] = new int[row][column];
        System.out.println("nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = matrix[0][0];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("Phan tu lon nhat trong ma tran la: " + max);
    }
}
