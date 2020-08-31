import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerFileBinary {
    public static ArrayList<Product> listProduct = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int index;
    public static File file = new File("source");
    String choice;

    public void menu() {
        do {
            System.out.println();
            System.out.print("Su lua chon cua ban la gi: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    showProduct();
                    break;
                case "3":
                    searchProduct();
                    break;
                case "0":
                    System.out.println("Hen gap lai ");
                    System.exit(0);

                default:
                    System.out.println(" nhap sai roi ban oi");
            }
        } while (!choice.equals("0"));
    }

    public static void addProduct() {
        listProduct = FuncFileCSV.getFileCSVListProduct();
//        Product product = new Product();
        System.out.print("Nhap ma san pham: ");
        String productCode = scanner.nextLine();
//        product.setProductCode(scanner.nextLine());
        System.out.print("nhap ten san pham: ");
        String productName = scanner.nextLine();
//        product.setProductName(scanner.nextLine());
        System.out.print("nhap hang san xuat: ");
        String manufacturer = scanner.nextLine();
//        product.setManufacturer(scanner.nextLine());
        System.out.print("nhap gia: ");
        String price = scanner.nextLine();
//        product.setPrice(scanner.nextLine());
        System.out.print("nhap cac mo ta: ");
        String description = scanner.nextLine();
//        product.setDescription(scanner.nextLine());

        if (isCheckName(productCode)){
            Product product = new Product(productCode, productName, manufacturer, price, description);
            listProduct.add(product);
            System.out.println("Them san pham thanh cong...");
        }
        else {
            System.out.println("Ma san pham da ton tai");
        }
//        listProduct.add(product );
//        FuncFileCSV.writeProductCSVFile(listProduct);
//        System.out.println("them san pham thanh cong");

    }


    public static void showProduct() {
        listProduct = FuncFileCSV.getFileCSVListProduct();
        for (Product product : listProduct) {
            System.out.println("-----------------------------------");
            System.out.println("Ma San Pham: " + product.getProductCode());
            System.out.println("Ten San Pham: " + product.getProductName());
            System.out.println("Nha San Xuat: " + product.getManufacturer());
            System.out.println("Gia san pham: " + product.getPrice());
            System.out.println("Mo ta: " + product.getDescription());
            System.out.println("-----------------------------------");

        }
    }

    public static void searchProduct() {
        System.out.print("nhap ten san pham can tim: ");
        String productCode = scanner.next();
        if (isproductcode(productCode)) {
            System.out.println(listProduct.get(index).toString());

        } else {
            System.out.println("nothing");
        }
    }

    public static boolean isproductcode(String productCode) {
        listProduct = FuncFileCSV.getFileCSVListProduct();
        for (int i = 0; i < listProduct.size(); i++) {
            if ((listProduct.get(i).getProductCode()).equals(productCode)) {
                index = i;
                return true;
            }
        }
        return false;
    }

    public static boolean isCheckName(String productCode){
        listProduct = FuncFileCSV.getFileCSVListProduct();
        for (Product product : listProduct){
            if (product.getProductCode().equals(productCode)){
                return false;
            }
        }
        return true;
    }
}
