import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPhoneBook {
    public static final String KHONG_TIM_THAY = "Khong tim thay";
    public static final String GHI_VAO_THANH_CONG = "Ghi vao thanh cong";
    public static final String DOC_THANH_CONG = "Đoc thanh cong";
    public static final String XOA_THANH_CONG = "Xoa thanh cong";
    public static final String BAN_CO_MUON_XOA_KHONG = "Ban co muon xoa khong";
    public static final String UPDATE_THANH_CONG = "Update thanh cong";
    public static final String NHAP_NHOM_DANH_BA = "Nhap nhom danh ba: ";
    public static final String DA_TON_TAI = "Da ton tai";
    public static final String DELETE = "Delete";
    List<PhoneBook> phonebooks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void getAll() {
        for (PhoneBook phonebook : phonebooks) {
            System.out.println("-----------------------------------");
            System.out.println("So dien thoai: " + phonebook.getPhoneNumber());
            System.out.println("Nhom danh ba: " + phonebook.getGroupPhoneNumber());
            System.out.println("Ten: " + phonebook.getName());
            System.out.println("Gioi tinh: " + phonebook.getGender());
            System.out.println("Dia chi: " + phonebook.getAddress());
            System.out.println("Ngay sinh: " + phonebook.getDayOfBirth());
            System.out.println("Email: " + phonebook.getEmail());
            System.out.println("-----------------------------------");
        }
    }

    public void add(PhoneBook phonebook) {
        if (checkPhone(phonebook.getPhoneNumber()) >= 0) {
            System.out.println(DA_TON_TAI);
        } else {
            phonebooks.add(phonebook);
            System.out.println(UPDATE_THANH_CONG);
        }
    }

    public void edit(String phoneNumber) {
        var index = checkPhone(phoneNumber);
        if (index >= 0) {
            var phonebook = phonebooks.get(index);
            System.out.println(NHAP_NHOM_DANH_BA);
            String group = Main.validateName();
            phonebook.setGroupPhoneNumber(group);
            System.out.println(Main.NHAP_HO_TEN);
            String name = Main.validateName();
            phonebook.setName(name);
            System.out.println(Main.NHAP_GIOI_TINH);
            String gender = Main.validateGender();
            phonebook.setGender(gender);
            System.out.println(Main.NHAP_DIA_CHI);
            String address = Main.validateName();
            phonebook.setAddress(address);
            System.out.println(Main.NHAP_NGAY_SINH);
            String birthDate = scanner.nextLine();
            phonebook.setDayOfBirth(birthDate);
            System.out.println(Main.NHAP_EMAIL);
            String email = Main.validateEmail();
            phonebook.setEmail(email);
            System.out.println(UPDATE_THANH_CONG);
        } else {
            System.out.println(KHONG_TIM_THAY);
        }
    }

    public void delete(String phoneNumber) {
        var index = checkPhone(phoneNumber);
        if (index >= 0) {
            boolean check = true;
            System.out.println(BAN_CO_MUON_XOA_KHONG);
            System.out.println("Y." + DELETE);
            System.out.println("Enter." + Main.THOAT);
            while (check) {
                String chose = scanner.nextLine();
                switch (chose.toUpperCase()) {
                    case "Y":
                        phonebooks.remove(index);
                        System.out.println(XOA_THANH_CONG);
                        check = false;
                        break;
                    default:
                        check = false;
                }
            }
        } else System.out.println(KHONG_TIM_THAY);
    }

    public void readFile() {
        phonebooks = FuncFile.readFile();
        System.out.println(DOC_THANH_CONG);
    }

    public void writeFile() {
        FuncFile.writeFile(phonebooks);
        System.out.println(GHI_VAO_THANH_CONG);
    }

    public int checkPhone(String phoneNumber) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (phoneNumber.equals(phonebooks.get(i).getPhoneNumber())) {
                System.out.println(phonebooks.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    public void search(String phoneNumber) {
        boolean check = false;
        for (PhoneBook phonebook : phonebooks) {
            if (phonebook.getPhoneNumber().contains(phoneNumber)) {
                check = true;
                System.out.print(phonebook.toString());
            }
        }
        if (!check) {
            System.out.println(KHONG_TIM_THAY);
        }
    }
}
