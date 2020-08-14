import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("Chao mung ban den voi he thong quan ly khach hang");
        System.out.println("Bam 1 de nhap khach hang");
        System.out.println("Bam 2 de tim kiem khach hang");
        System.out.println("Bam 3 de in thong tin khach hang");
        System.out.println("Bam 4 de in toan bo thong tin khach hang");
        System.out.println("Bam 5 de tang so don hang cho khach");
        System.out.println("Bam 0 de thoat");
        System.out.println("==========================================");
        CustomerManagement start = new CustomerManagement();
        start.menu();

    }
}
