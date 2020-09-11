import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static final String XEM_DANH_SACH = "Xem danh sach:";
    public static final String THEM_MOI = "Them moi: ";
    public static final String CAP_NHAT = "Cap nhat: ";
    public static final String XOA = "Xoa: ";
    public static final String TIM_KIEM = "Tim kiem: ";
    public static final String ĐOC_TU_FILE = "Doc tu file:";
    public static final String GHI_VAO_FILE = "Ghi vao file:";
    public static final String THOAT = "Thoat!";
    public static final String CHON_CHUC_NANG = "Chon chuc nang theo so(de tiep tuc):";
    public static final String CHUONG_TRINH = "----CHUONG TRINH QUAN LY DANH BA----";
    public static final String NHAP_SO_ĐIEN_THOAI = "Nhap so dien thoai: ";
    public static final String NHAP_SAI = "Nhap sai!";
    public static final String NHAP_GIOI_TINH = "Nhap gioi tinh: ";
    public static final String NHAP_HO_TEN = "Nhap ho ten: ";
    public static final String NHAP_DIA_CHI = "Nhap dia chi: ";
    public static final String NHAP_NGAY_SINH = "Nhap ngay sinh: ";
    public static final String NHAP_EMAIL = "Nhap email: ";
    public static final String NHAP_NHOM_DANH_BA = "Nhap nhom danh ba moi: ";
    public static final String NHAP_LUA_CHON = "Nhap lua chon: ";
    public static final String VUI_LONG_NHAP_LAI = "Vui long nhap lai:";
    static ManagerPhoneBook phonebooks = new ManagerPhoneBook();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.println(NHAP_LUA_CHON);
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println(XEM_DANH_SACH);
                    getAllPhoneBook();
                    break;
                case "2":
                    System.out.println(THEM_MOI);
                    addPhoneBook();
                    break;
                case "3":
                    System.out.println(CAP_NHAT);
                    editPhonebook();
                    break;
                case "4":
                    System.out.println(XOA);
                    deletePhonebook();
                    break;
                case "5":
                    System.out.println(TIM_KIEM);
                    searchPhoneNumber();
                    break;
                case "6":
                    System.out.println(ĐOC_TU_FILE);
                    readFilePhoneBook();
                    break;
                case "7":
                    System.out.println(GHI_VAO_FILE);
                    writeFilePhoneBook();
                    break;
                case "8":
                    System.out.println(THOAT);
                    System.exit(8);
            }
        }
    }

    public static void menu() {
        System.out.println(CHUONG_TRINH);
        System.out.println(CHON_CHUC_NANG);
        System.out.println("1." + XEM_DANH_SACH);
        System.out.println("2." + THEM_MOI);
        System.out.println("3." + CAP_NHAT);
        System.out.println("4." + XOA);
        System.out.println("5." + TIM_KIEM);
        System.out.println("6." + ĐOC_TU_FILE);
        System.out.println("7." + GHI_VAO_FILE);
        System.out.println("8." + THOAT);
    }

    public static void getAllPhoneBook() {
        phonebooks.getAll();
    }

    public static void addPhoneBook() {
        PhoneBook phonebook = new PhoneBook();
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = validatePhone();
        phonebook.setPhoneNumber(phoneNumber);
        System.out.println(NHAP_NHOM_DANH_BA);
        String group = validateName();
        phonebook.setGroupPhoneNumber(group);
        System.out.println(NHAP_HO_TEN);
        String name = validateName();
        phonebook.setName(name);
        System.out.println(NHAP_GIOI_TINH);
        String gender = validateGender();
        phonebook.setGender(gender);
        System.out.println(NHAP_DIA_CHI);
        String address = validateName();
        phonebook.setAddress(address);
        System.out.println(NHAP_NGAY_SINH);
        String birthDate = validateBirthDay();
        phonebook.setDayOfBirth(birthDate);
        System.out.println(NHAP_EMAIL);
        String email = validateEmail();
        phonebook.setEmail(email);
        phonebooks.add(phonebook);
    }

    public static void editPhonebook() {
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = scanner.nextLine();
        phonebooks.edit(phoneNumber);
    }

    public static void deletePhonebook() {
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = scanner.nextLine();
        phonebooks.delete(phoneNumber);
    }

    public static void readFilePhoneBook() {
        phonebooks.readFile();
    }

    public static void writeFilePhoneBook() {
        phonebooks.writeFile();
    }

    public static void searchPhoneNumber() {
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = scanner.nextLine();
        phonebooks.search(phoneNumber);
    }


    public static String validateGender() {
        boolean flag;
        String input = scanner.nextLine();
        String regexGender = "^nam$|^nu$";
        flag = input.matches(regexGender);
        while (!flag) {
            System.out.println(NHAP_SAI + NHAP_GIOI_TINH);
            input = scanner.nextLine();
            flag = input.matches(regexGender);
        }
        return input;
    }

    public static String validatePhone() {
        boolean flag;
        String input = scanner.nextLine();
        String regexPhone = "^(08|09|03|07|)([0-9]{8})$";
        flag = input.matches(regexPhone);
        while (!flag) {
            System.out.println(NHAP_SAI + NHAP_SO_ĐIEN_THOAI);
            input = scanner.nextLine();
            flag = input.matches(regexPhone);
        }
        return input;
    }

    public static String validateEmail() {
        String email = scanner.nextLine();
        String regexEmail =
                "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        while (!Pattern.matches(regexEmail, email)) {
            System.out.println(NHAP_SAI + NHAP_EMAIL);
            email = scanner.nextLine();
        }
        return email;
    }

    public static String validateName() {
        String name = scanner.nextLine();
        String regxName = "^[a-z A-Z]+$";
        while (!Pattern.matches(regxName, name)) {
            System.out.println(NHAP_SAI + VUI_LONG_NHAP_LAI);
            name = scanner.nextLine();
        }
        return name;
    }
    public static String validateBirthDay() {
        String dayOfBirth;
        String regexBirthDay = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        while (true) {
            System.out.print(NHAP_NGAY_SINH);
            dayOfBirth = scanner.nextLine();
            Pattern patternId = Pattern.compile(regexBirthDay);
            if (patternId.matcher(dayOfBirth).find()) {
                return dayOfBirth;
            } else {
                System.out.println(NHAP_SAI + NHAP_NGAY_SINH);
            }
        }
    }
}
