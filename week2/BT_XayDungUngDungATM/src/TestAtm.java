import java.text.NumberFormat;
import java.util.Scanner;

public class TestAtm {
    public static void main(String[] args) {

        Atm atm = new Atm("Nguyen Van A", 1200000);
        Scanner scanner = new Scanner(System.in);
        String choice;
//        GiaoDich[] giaoDich = new GiaoDich[3];
//        GiaoDich newgiaodich = new GiaoDich();
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        String moneyString = formatter.format();
//        System.out.println(moneyString);


        System.out.println("Ngan Hang ABC kinh chao quy khach: " + atm.getName());
        do {
            System.out.println("Menu");
            System.out.println("1. Nhan phim A de kiem tra tai khoan");
            System.out.println("2. Nhan phim B de nap tien");
            System.out.println("3. Nhan phim W de rut tien");
            System.out.println("4. Nhan phim H de xem lich su 3 lan rut tien");
            System.out.println("5. Nhan phim X de thoat");
            System.out.print("Su lua chon cua ban la gi: ");
            choice = scanner.next();

            switch (choice) {
                case "A":
                    System.out.println("So du tai khoan khach hang la: " + atm.getTaiKhoan() + " vnd");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;

                case "B":
                    System.out.println("Giao dich nap tien");
                    System.out.print("Vui long nhap so tien: ");
                    double soTienNhap = scanner.nextDouble();
                    atm.setTaiKhoan(atm.getTaiKhoan() + soTienNhap);
                    System.out.println("Giao dich thanh cong. Ban vua nap " + soTienNhap + " thanh cong");
                    System.out.println("So du tai khoan la: " + atm.getTaiKhoan() + " vnd");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;

                case "W":
                    System.out.println("Giao dich rut tien");
                    System.out.print("Vui long nhap so tien: ");
                    soTienNhap = scanner.nextDouble();
                    if (atm.getTaiKhoan() - 50000 < soTienNhap) {
                        System.out.println("loi vi so du k du");
                        break;
                    } else {
                        atm.setTaiKhoan(atm.getTaiKhoan() - soTienNhap);
                    }
                    System.out.println("Giao dich thanh cong. Ban vua rut: " + soTienNhap + " thanh cong.");
                    System.out.println("So du tai khoan: " + atm.getTaiKhoan() + " vnd");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    break;

                case "H":
                    System.out.println("Lich su giao dich");
                    break;

                case "X":
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    System.exit(0);

                default:
                    System.out.println("Ban da nhap sai chuc nang");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
            }

        } while (choice != "");
    }
}
