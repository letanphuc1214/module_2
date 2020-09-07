import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerPhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<PhoneBook> listPhone = new ArrayList<>();
    public static File file = new File("data/contact.csv");
    public static int index;
    String choose;

    public void menu() {
        do {
            System.out.println();
            System.out.print("Chon chuc nang: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1" -> show();
                case "2" -> add();
                case "3" -> edit();
                case "4" -> delete();
                case "5" -> search();
                case "6" -> {
                    System.out.println("Hen gap lai ");
                    System.exit(0);
                }
                default -> System.out.println(" nhap sai roi ban oi");
            }
        } while (!choose.equals("0"));
    }

    public void add() {
        String phoneNumber = checkPhoneNumberFormat();
        String groupPhoneNumber = checkGroupFormat();
        String name = checkNameFormat();
        String gender = checkGenderFormat();
        String address = inputAddress();
        String dayOfBirth = checkBirthDayFormat();
        String email = checkEmailFormat();

        if (checkPhoneNumber(phoneNumber)) {
            PhoneBook phoneBook = new PhoneBook(phoneNumber, groupPhoneNumber, name, gender, address, dayOfBirth, email);
            listPhone.add(phoneBook);
            FuncFile.writeFile(listPhone);
            System.out.println("Them thanh cong");
        } else {
            System.out.println("So dien thoai da ton tai");
        }
    }

    public void show() {
        listPhone = FuncFile.readFile();
        for (PhoneBook phoneBook : listPhone) {
            System.out.println("-----------------------------------");
            System.out.println("So dien thoai: " + phoneBook.getPhoneNumber());
            System.out.println("Nhom danh ba: " + phoneBook.getGroupPhoneNumber());
            System.out.println("Ten: " + phoneBook.getName());
            System.out.println("Gioi tinh: " + phoneBook.getGender());
            System.out.println("Dia chi: " + phoneBook.getAddress());
            System.out.println("Ngay sinh: " + phoneBook.getDayOfBirth());
            System.out.println("Email: " + phoneBook.getEmail());
            System.out.println("-----------------------------------");
        }
    }

    public void edit() {
        listPhone = FuncFile.readFile();
        System.out.println("So dien thoai ban muon thay doi");
        String editPhone = checkPhoneNumberFormat();
        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).getPhoneNumber().equals(editPhone)) {

                listPhone.get(i).setGroupPhoneNumber(checkGroupFormat());
                listPhone.get(i).setName(checkNameFormat());
                listPhone.get(i).setGender(checkGenderFormat());
                listPhone.get(i).setAddress(inputAddress());
                listPhone.get(i).setDayOfBirth(checkBirthDayFormat());
                listPhone.get(i).setEmail(checkEmailFormat());
                FuncFile.writeFile(listPhone);
                System.out.println("Sua thanh cong");
            } else {
                System.out.println("Khong tim duoc danh ba voi so dien thoai tren");
            }
        }
    }

    public void delete() {
        listPhone = FuncFile.readFile();
        System.out.println("So dien thoai ban muon xoa");
        String deletePhone = checkPhoneNumberFormat();
        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).getPhoneNumber().equals(deletePhone)) {
                listPhone.remove(i);
                FuncFile.writeFile(listPhone);
                System.out.println("Xoa thanh cong ");
                break;
            }
        }
    }

    public void search() {
        listPhone = FuncFile.readFile();
        System.out.println("Nhap so dien thoai can tim");
        String searchPhone = checkPhoneNumberFormat();
        if (isSearchPhoneNumber(searchPhone)) {
            System.out.println(listPhone.get(index).toString());
        } else {
            System.out.println("khong tim thay so dien thoai trong danh ba");
        }
    }

    public String checkPhoneNumberFormat() {
        String phoneNumber;
        String regex = "^(08|09|03|07|)([0-9]{8})$";
        while (true) {
            System.out.println("Nhap so dien thoai: ");
            phoneNumber = scanner.nextLine();
            Pattern patternPhoneNumber = Pattern.compile(regex);
            if (patternPhoneNumber.matcher(phoneNumber).find()) {
                return phoneNumber;
            } else {
                System.out.println("So dien thoai khong dung dinh dang.");
            }
        }
    }

    public String checkGroupFormat() {
        String groupPhoneNumber;
        String regex = "^([a-z A-Z])+$";
        while (true) {
            System.out.println("Nhap nhom danh ba: ");
            groupPhoneNumber = scanner.nextLine();
            Pattern patternPhoneNumber = Pattern.compile(regex);
            if (patternPhoneNumber.matcher(groupPhoneNumber).find()) {
                return groupPhoneNumber;
            } else {
                System.out.println("Nhom danh ba khong dung dinh dang.");
            }
        }
    }

    public String checkNameFormat() {
        String name;
        String regex = "^[a-z A-Z]+$";
        while (true) {
            System.out.print("Nhap ten danh ba: ");
            name = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(name).find()) {
                return name;
            } else {
                System.out.println("Ten danh ba khong dung dinh dang");
            }
        }
    }

    public String checkGenderFormat() {
        String gender;
        String regex = "^nam$|^nu$";
        while (true) {
            System.out.print("Nhap gioi tinh: ");
            gender = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(gender).find()) {
                return gender;
            } else {
                System.out.println("Gioi tinh khong dung dinh dang");
            }
        }
    }

    public String inputAddress() {
        System.out.print("Nhap dia chi: ");
        return scanner.nextLine();
    }

    public String checkBirthDayFormat() {
        String dayOfBirth;
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        while (true) {
            System.out.print("Nhap ngay sinh: ");
            dayOfBirth = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(dayOfBirth).find()) {
                return dayOfBirth;
            } else {
                System.out.println("Ngay sinh khong dung dinh dang");
            }
        }
    }

    public String checkEmailFormat() {
        String email;
        String regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        while (true) {
            System.out.print("nhap email: ");
            email = scanner.nextLine();
            Pattern patternEmail = Pattern.compile(regex);
            if (patternEmail.matcher(email).find()) {
                return email;
            } else {
                System.out.println("Email khong dung dinh dang.");
            }
        }
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        for (PhoneBook phoneBook : listPhone) {
            if (phoneNumber.equals(phoneBook.getPhoneNumber())) {
                return false;
            }
        }
        return true;
    }


    public static boolean isSearchPhoneNumber(String phoneNumber) {
        listPhone = FuncFile.readFile();
        for (int i = 0; i < listPhone.size(); i++) {
            if ((listPhone.get(i).getPhoneNumber()).equals(phoneNumber)) {
                index = i;
                return true;
            }
        }
        return false;
    }


}
