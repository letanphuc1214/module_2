package UI;

import DAO.StudentImp;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("--------------------MENU DANH SÁCH HỌC SINH--------------------");
        System.out.println("1. Xem danh sách học sinh.");
        System.out.println("2. Thêm học sinh");
        System.out.println("3. Sửa thông tin học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Nhập / Sửa điểm học sinh");
        System.out.println("6. Xếp loại học sinh");
        System.out.println("0. Thoát menu");
        System.out.println("---------------------------------------------------------------");
        StudentImp start = new StudentImp();
        start.menu();
    }
}
