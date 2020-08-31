public class Customer {
    private int taiKhoan = 10000;

    public Customer() {
        System.out.println("Tai khoan hien co = " + taiKhoan);
    }

    public synchronized void rutTien(int soTienRut) {
        System.out.println("Giao dich rut tien dang duoc thuc hien voi" + "so tien = " + soTienRut + "...");
        if (taiKhoan < soTienRut) {
            System.out.println("so tien trong tai khoan khong du!");
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
        taiKhoan -= soTienRut;
        System.out.println("rut tien thanh cong. So tien hien co trong tai khoan = " + taiKhoan);
    }

    public synchronized void nopTien(int soTienNop) {
        System.out.println("giao dich nop tien dang duoc thuc hien voi" + "so tien nop = " + soTienNop + "...");
        taiKhoan += soTienNop;
        System.out.println("nop tien thanh cong. So tien hien co trong tai khoan = " + taiKhoan);
        notify();
    }

}
