import java.util.Scanner;

public class Atm {
    double taiKhoan = 50000;
    String name ;

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

}
