import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
    public static final String NHAP_SO_DIEN_THOAI_KHACH_HANG = "Nhap so dien thoai khach hang: ";
    public static final String KHONG_TON_TAI_KHACH_HANG = "Khong ton tai khach hang";
    public static final String HE_THONG_DANG_TIM_KIEM = "He thong dang tim kiem... ";
    public static final String SO_DON_HANG_DA_MUA = ", So don hang da mua: ";
    public static final String KET_QUA = "Ket qua: ";
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer();
    ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    int choice;

    public void menu() {
        do {
            System.out.println();
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


    public void searchCustomer() {
        System.out.println(NHAP_SO_DIEN_THOAI_KHACH_HANG);
        String PhoneNumber = scanner.nextLine();
        System.out.println(HE_THONG_DANG_TIM_KIEM);
        System.out.println(KET_QUA);
        if (!checkPhoneNumber(PhoneNumber)) {
            System.out.println(KHONG_TON_TAI_KHACH_HANG);
        }

    }

    public void searchCustomerAndOrder() {
        System.out.println(NHAP_SO_DIEN_THOAI_KHACH_HANG);
        String PhoneNumber = scanner.nextLine();
        System.out.println(HE_THONG_DANG_TIM_KIEM);
        System.out.println(KET_QUA);
        checkPhoneNumberAndOrder(PhoneNumber);
    }


    public void customerInformation() {
        System.out.println("Thong tin khach hang ");
        int count = 0;
        for (Customer customer : listCustomer) {
            System.out.println(customer + SO_DON_HANG_DA_MUA + customer.getPurcharseOrder());
            count++;
        }
        System.out.println("...");
        System.out.println("Tong co " + count + " khach hang trong he thong");
    }


    //In ra thông tin khi đơn tăng lên 1
    public void increaseOrder() {
        System.out.println(NHAP_SO_DIEN_THOAI_KHACH_HANG);
        String PhoneNumber = scanner.nextLine();
        System.out.println("Thong tin sau khi tang 1 don hang ");
        checkPhoneNumberOrderIncrease(PhoneNumber);
    }



    public boolean checkCustomer(String phoneNumber, String email) {
        for (Customer customer : listCustomer) {
            if (customer.getEmail().equals(email) && customer.getPhoneNumber().equals(phoneNumber)) {
                return false;
            }
        }
        return true;
    }



    public boolean checkPhoneNumber(String phoneNumber) {
        for (Customer customer : listCustomer) {
            if (phoneNumber.equals(customer.getPhoneNumber())) {
                System.out.print(customer.toString());
                return true;
            }
        }
        return false;
    }


    public void checkPhoneNumberAndOrder(String phoneNumber) {
        if (checkPhoneNumber(phoneNumber)) {
            for (Customer customer : listCustomer) {
                if (phoneNumber.equals(customer.getPhoneNumber())) {
                    System.out.println(SO_DON_HANG_DA_MUA + customer.getPurcharseOrder());
                    System.out.println();
                }
            }
        } else System.out.println(KHONG_TON_TAI_KHACH_HANG);
    }



    public boolean checkPhoneNumberOrderIncrease(String phoneNumber) {
        for (Customer customer : listCustomer) {
            if (phoneNumber.equals(customer.getPhoneNumber())) {
                customer.setPurcharseOrder(customer.getPurcharseOrder() + 1);
                System.out.println(customer + SO_DON_HANG_DA_MUA + customer.getPurcharseOrder());
                return true;
            }
        }
        System.out.println(KHONG_TON_TAI_KHACH_HANG);
        return false;
    }
}
