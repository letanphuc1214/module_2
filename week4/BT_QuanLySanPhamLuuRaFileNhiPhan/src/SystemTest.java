import java.io.IOException;

public class SystemTest {
    public static void main(String[] args) throws IOException {
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi thong tin san pham");
        System.out.println("3. Tim kiem thong tin san pham");
        System.out.println("0. Thoat");
        ProductManagerFileBinary start = new ProductManagerFileBinary();
        start.menu();
    }
}
