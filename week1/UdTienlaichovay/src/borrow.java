import java.util.Scanner;

public class borrow {
    public static void main(String[] args){
        double sotiengui;
        double tilelaisuat;
        byte thang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien ");
        sotiengui = scanner.nextDouble();

        System.out.println("nhap ti le lai suat ");
        tilelaisuat = scanner.nextDouble();

        System.out.println("nhap so thang");
        thang = scanner.nextByte();

        double sotienlai = 0;
        for (byte i = 0; i < thang; i++){
            sotienlai += sotiengui * (tilelaisuat/100)/12 * thang;
        }
        System.out.println("so tien lai la: " + sotienlai);
    }
}
