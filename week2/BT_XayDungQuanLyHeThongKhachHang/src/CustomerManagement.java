import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer();
    ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    int choice;

    public void menu() {
        do {
            System.out.print("Su lua chon cua ban la gi: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    searchCustomer();
                    break;
                case 3:
                    searchCustomerAndOrder();
                    break;
                case 4:
                    customerInformation();
                    break;
                case 5:
                    increaseOrder();
                    break;
                case 0:
                    System.out.println("He thong Quan ly khach hang vua shutdown.");
                    System.exit(0);

                default:
                    System.out.println(" nhap sai roi ban oi");
            }
        } while (choice != 0);
    }


    //Nhập thông tin khách hàng
    public void addCustomer() {
        System.out.println("Nhap ten khach hang: ");
        String customerName = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender = scanner.nextLine();
        if (checkCustomer(phoneNumber, email)) {
            Customer addCustomer = new Customer(customerName, address, email, phoneNumber, gender, 0);
            listCustomer.add(addCustomer);
            System.out.println("Ban vua them moi khach hang " + customerName + " thanh cong");
        } else {
            System.out.println("Khach hang da ton tai");
        }

        System.out.println("Chon menu de thuc hien tiep");
    }


    //Nhập sđt và in ra thông tin khách hàng
    public void searchCustomer() {
        System.out.println("Nhap so dien thoai khach hang: ");
        String PhoneNumber = scanner.nextLine();
        System.out.println("He thong dang tim kiem... ");
        System.out.println("Ket qua: ");
        checkPhoneNumber(PhoneNumber);
    }


    //Nhập sđt in ra thông tin và số đơn
    public void searchCustomerAndOrder() {
        System.out.println("Nhap so dien thoai khach hang: ");
        String PhoneNumber = scanner.nextLine();
        System.out.println("He thong dang tim kiem... ");
        System.out.println("Ket qua: ");
        checkPhoneNumberAndOrder(PhoneNumber);
    }


    //In ra thông tin khách hàng đã mua
    public void customerInformation() {
        System.out.println("Thong tin khach hang ");
        int count = 0;
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println(listCustomer.get(i) + ", so don hang da mua: " + listCustomer.get(i).getPurcharseOrder());
            count++;

        }
        System.out.println("...");
        System.out.println("Tong co " + count++ + " khach hang trong he thong");
    }


    //In ra thông tin khi đơn tăng lên 1
    public void increaseOrder() {
        System.out.println("Nhap so dien thoai khach hang: ");
        String PhoneNumber = scanner.nextLine();
        System.out.println("Thong tin sau khi tang 1 don hang ");
        checkPhoneNumberOrderIcrease(PhoneNumber);
    }


    //check xem nhập email và sđt có trùng hay không
    public boolean checkCustomer(String phoneNumber, String email) {
        for (int i = 0; i < listCustomer.size(); i++) {
            if (phoneNumber.equals(listCustomer.get(i).getPhoneNumber()) && email.equals(listCustomer.get(i).getEmail())) {
                return false;
            }
        }
        return true;
    }


    //check sđt có trong list chưa
    public boolean checkPhoneNumber(String phoneNumber) {
        for (int i = 0; i < listCustomer.size(); i++) {
            if (phoneNumber.equals(listCustomer.get(i).getPhoneNumber())) {
                System.out.println(listCustomer.get(i));
                return true;
            }
        }
        System.out.println("Khong ton tai khach hang");
        return false;

    }


    //check sđt  có trong list chưa
    public boolean checkPhoneNumberAndOrder(String phoneNumber) {
        for (int i = 0; i < listCustomer.size(); i++) {
            if (phoneNumber.equals(listCustomer.get(i).getPhoneNumber())) {
                System.out.println(listCustomer.get(i) + ", So don hang da mua: " + listCustomer.get(i).getPurcharseOrder());
                return true;
            }
        }
        System.out.println("Khong ton tai khach hang");
        return false;

    }


    //    check sđt khi có đơn hàng tăng lên 1
    public boolean checkPhoneNumberOrderIcrease(String phoneNumber) {
        for (int i = 0; i < listCustomer.size(); i++) {
            if (phoneNumber.equals(listCustomer.get(i).getPhoneNumber())) {
                listCustomer.get(i).setPurcharseOrder(listCustomer.get(i).getPurcharseOrder() + 1);
                System.out.println(listCustomer.get(i) + ", So don hang da mua : " + listCustomer.get(i).getPurcharseOrder());
                return true;
            }
        }
        System.out.println("Khong ton tai khach hang");
        return false;
    }
}
