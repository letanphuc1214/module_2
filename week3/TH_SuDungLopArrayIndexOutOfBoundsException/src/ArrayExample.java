import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRamdom(){
        Random rd = new Random();
        Integer[] arr =  new Integer[100];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < 100; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRamdom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap chi so cua mot phan tu bat ki: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
