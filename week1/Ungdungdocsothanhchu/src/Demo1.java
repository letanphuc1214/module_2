import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so");
//        byte  ngay = scanner.nextByte();
        byte[] array = {1};
        for (byte i = 0; i <= array.length-2; i++){
            System.out.print(array[i] + ",");
        };
        System.out.print(array[array.length-1]);


    }
}
