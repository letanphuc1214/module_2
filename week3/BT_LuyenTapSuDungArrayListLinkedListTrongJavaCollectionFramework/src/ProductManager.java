import java.util.*;

public class ProductManager {
    public static ArrayList<Product> productsList = new ArrayList<>();
    public static int idProduct = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int yourChoice = 10;
        while (yourChoice != 0) {
            menu();
            System.out.print("nhap lua chon cua ban: ");
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
                    showProduct();
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
                    System.out.println("nhap lai di ban oi");
            }
        }
    }

    public static void menu() {
        System.out.println("1. Them san pham");
        System.out.println("2. Sua thong tin san pham theo id");
        System.out.println("3. Xoa san pham theo id");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Tim kiem san pham theo ten");
        System.out.println("6. Sap xep san pham tang dan theo gia");
        System.out.println("7. Sap xep san pham giam dan theo gia");
        System.out.println("0. Thoat");
    }

    public static void add() {
        Product product = new Product();
        System.out.print("nhap ten san pham: ");
        product.name = scanner.next();
        System.out.print("nhap gia san pham: ");
        product.gia = Integer.parseInt(scanner.next());
        product.id = ++idProduct;
        productsList.add(product);
    }

    public static void delete() {
        System.out.print("nhap id can xoa: ");
        Product product = checkId(scanner.nextInt());
        productsList.remove(product);

    }

    public static void showProduct() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }

    public static Product checkId(int idProduct) {
        for (Product product : productsList) {
            if (idProduct == product.getId()) {
                return product;
            }
        }
        return null;
    }

    public static void edit() {
        System.out.print("nhap id can sua: ");
        Product product = checkId(scanner.nextInt());
        System.out.print("nhap ten san pham can sua: ");
        product.setName(scanner.next());
        System.out.println("nhap gia san pham can sua: ");
        product.setGia(Integer.parseInt(scanner.next()));

    }

    public static void exit() {
        System.out.println("Chao tam biet");
        System.exit(0);
    }

    public static void sortProductDecrease() {
        Collections.sort(productsList, new SortProductDecrease());
        System.out.println("San pham giam dan theo gia: ");
        showProduct();
    }

    public static void sortProductIncrease(){
        Collections.sort(productsList, new SortProductIncrease());
        System.out.println("San pham tang dan theo gia: ");
        showProduct();
    }

    public static void searchProductByName(){
        System.out.println("nhap ten san pham can tim: ");
        String name = scanner.next();
        if (checkName(name) >= 0){
            System.out.println(productsList.get(checkName(name)).toString());
        }
        else {
            System.out.println("khong co san pham nao ten do ");
        }


    }

    public static int checkName(String name){
        for (int i = 0; i < productsList.size(); i++){
            if (name.equals(productsList.get(i).getName())){
                return i;
            }
        }
        return -1;
    }
}
