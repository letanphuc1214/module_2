import java.util.*;

public class ProductManager {
    public static ArrayList<Product> productList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int idProduct = 0;

    public static void main(String[] args) {
        int yourChoice = 10;

        while (yourChoice != 0) {
            menu();
            System.out.print("Su lua chon cua ban la gi: ");
            yourChoice = Integer.parseInt(scanner.next());
            switch (yourChoice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    showAllProduct();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortProductDecrease();
                    break;
                case 7:
                    sortProductIncrease();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.print("Nhap lai di ban oi");

            }

        }
    }

    public static void menu() {
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm  giảm dần theo giá");
        System.out.println("7. Sắp xếp sản phẩm tăng dần theo giá");
        System.out.println("0. Thoat");

    }

    public static void add() {
        Product product = new Product();
        System.out.println("Nhap ten SP: ");
        product.name = scanner.next();
        System.out.println("Nhap gia san pham: ");
        product.gia = Integer.parseInt(scanner.next());
        product.id = ++idProduct;
        productList.add(product);
    }

    public static void exit() {
        System.out.println("Chao tam biet...");
        System.exit(0);

    }

    public static void showAllProduct() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static void edit(){
        System.out.print("Nhap id can sua: ");
        Product product = checkId(scanner.nextInt());
        System.out.print("nhap ten san pham can sua: ");
        product.setName(scanner.next());
        System.out.print("nhap gia san pham can sua: ");
        product.setGia(scanner.nextInt());

    }

    public static void delete(){
        System.out.println("nhap id can xoa: ");
        Product product = checkId(scanner.nextInt());
        productList.remove(product);
    }

    public static Product checkId(int idProduct){
        for (Product product : productList){
            if (idProduct == product.getId()){
                return product;
            }
        }
        return null;
    }

    public static void searchProductByName(){
        System.out.print("nhap ten san pham: ");
        String name = scanner.next();
        if (checkName(name) >= 0){
            System.out.println(productList.get(checkName(name)).toString());
        }
        else {
            System.out.println("khong co ten san pham nao nhu the ca");
        }
    }

    public static int checkName(String name){
        for (int i = 0; i < productList.size(); i++){
            if (name.equals(productList.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    public static void sortProductDecrease(){
        Collections.sort(productList, new SortProductDecrease());
        System.out.println("Sap xep san pham theo gia giam dan: ");
        showAllProduct();
    }

    public static void sortProductIncrease(){
        Collections.sort(productList, new SortProductIncrease());
        System.out.println("Sap xep san pham theo gia tang dan: ");
        showAllProduct();
    }


}
