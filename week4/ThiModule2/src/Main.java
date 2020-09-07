
public class Main {
    public static void main(String[] args) {
        System.out.println("--- CHUONG TRINH QUAN LYS DANH BA ----");
        System.out.println("Chon chuc nang theo so (de tiep tuc):");
        System.out.println("1. Xem danh sach");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Tim kiem");
        System.out.println("6.Thoat");
        ManagerPhoneBook start = new ManagerPhoneBook();
        start.menu();

    }
}
