import com.sun.security.jgss.GSSUtil;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi thong tin san pham");
        System.out.println("3. Tim kiem san pham");
        System.out.println("0. Thoat");
        ProductBinary start = new ProductBinary();
        start.menu();
    }
}