import java.io.File;
import java.nio.file.Files;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;


public class ProductBinary {
    public static ArrayList<Product> listProduct = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static File file = new File("Text");
    public static int index;
    String choose;

    public void menu() {
        do {
            System.out.println();
            System.out.print("Su lua chon cua ban la gi: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    themSanPham();
                    break;
                case "2":
                    hienThiSanPham();
                    break;
                case "3":
                    timKiemSanPham();
                    break;
                case "0":
                    System.out.println("Hen gap lai");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai roi ban oi");
            }
        } while (!choose.equals("0"));
    }

    public static void themSanPham() {
        listProduct = FuncFileCSV.getFile();
        System.out.println("Nhap ma san pham: ");
        String maSanPham = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhap ten nha san xuat: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhap gia: ");
        String gia = scanner.nextLine();
        System.out.println("Nhap mo ta: ");
        String moTa = scanner.nextLine();

        if (ktMaSanPham(maSanPham)) {
            Product product = new Product(maSanPham, tenSanPham, nhaSanXuat, gia, moTa);
            listProduct.add(product);
            FuncFileCSV.getFile();
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Ma san pham da ton tai");
        }
    }

    public static void hienThiSanPham() {
        listProduct = FuncFileCSV.getFile();
        for (Product product : listProduct) {
            System.out.println("-----------------------------");
            System.out.println("Ma san pham: " + product.getMaSanPham());
            System.out.println("Ten san pham: " + product.getTenSanPham());
            System.out.println("Nha san xuat: " + product.getNhaSanXuat());
            System.out.println("Gia: " + product.getGia());
            System.out.println("Mo ta: " + product.getMoTa());
            System.out.println("-----------------------------");
        }
    }

    public static void timKiemSanPham(){
        System.out.println("Nhap san pham can tim: ");
        String maSanPham = scanner.nextLine();
        if (isMaSanPham(maSanPham)){
            System.out.println(listProduct.get(index).toString());
        }
        else {
            System.out.println("san pham khong ton tai");
        }
    }

    public static boolean isMaSanPham(String maSanPham){
        listProduct = FuncFileCSV.getFile();
        for (int i = 0; i < listProduct.size(); i++){
            if (listProduct.get(i).getMaSanPham().equals(maSanPham)){
                index = i;
                return true;
            }
        }
        return false;
    }

    public static boolean ktMaSanPham(String maSanPham) {
        listProduct = FuncFileCSV.getFile();
        for (Product product : listProduct) {
            if (product.getMaSanPham().equals(maSanPham)) {
                return false;
            }
        }
        return true;
    }
}
