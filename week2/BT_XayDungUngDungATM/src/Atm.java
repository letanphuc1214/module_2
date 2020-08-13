import java.util.Scanner;

public class Atm {
    double taiKhoan = 50000;
    String name ;
//    String[] histories =new String[3];
    public String getName() {
        return name;
    }

    public Atm ( String name,double taiKhoan){
        this.taiKhoan = taiKhoan;
        this.name = name;

    }

    public Atm() {
    }

    public double getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(double taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
//    public void getLichSu(String[] histories){
//        for (int i = 0; i < histories.length; i++){
//            System.out.println();
//        }
//    }

}
