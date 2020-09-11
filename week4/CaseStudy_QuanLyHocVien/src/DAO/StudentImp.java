package DAO;

import Entity.FuncFile;
import Entity.SortStudentByPoint;
import Entity.Student;

import java.util.*;
import java.util.regex.Pattern;

public class StudentImp extends Student implements StudentDAO {
    HashMap<String, Student> listStudent = FuncFile.readFile();
    private static final Scanner scanner = new Scanner(System.in);
    String choose;

    public StudentImp() throws ClassNotFoundException {
    }

    @Override
    public HashMap<String, Student> getAllStudent() {
        return listStudent;
    }

    @Override
    public void menu() throws ClassNotFoundException {
        do {
            System.out.println();
            System.out.print("Sự lựa chọn của bạn là gì: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    showInformationStudent();
                    break;
                case "2":
                    add();
                    break;
                case "3":
                    edit();
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    addAndEditPoint();
                    break;
                case "6":
                    sortStudent();
                    break;
//                case "7":
                case "0":
                    System.out.println("Hẹn gặp lại lần sau");
                    System.exit(0);
                default:
                    System.out.println("Nhập sai rồi bạn gì đó ơi");
            }

        } while (!choose.equals("0"));
    }

    public void showInformationStudent() {
        getAllInformationStudent();
    }

    @Override
    public void add() throws ClassNotFoundException {
        String idStudent = checkIdFormat();
        String studentName = checkNameFormat();
        String age = checkAgeFormat();
        String address = inputAddress();
        String gender = checkGenderFormat();
        String phoneNumber = checkPhoneNumberFormat();

        if (checkIdStudent(idStudent)) {
            Student student = new Student(idStudent, studentName, age, address, gender, phoneNumber);
            listStudent.put(idStudent, student);
            FuncFile.writeFile(listStudent);
            System.out.println("Thêm thành công.");
        } else {
            System.out.println("Mã sinh viên đã tồn tại");
        }
    }

    @Override
    public void edit() {
        getAllInformationStudent();
        System.out.println("Nhập mã học sinh muốn sửa: ");
        String idEditStudent = scanner.nextLine();
        if (listStudent.containsKey(idEditStudent)) {
            System.out.println("--------------------------------------------------");
            listStudent.get(idEditStudent).setIdStudent(checkIdFormat());
            listStudent.get(idEditStudent).setStudentName(checkNameFormat());
            listStudent.get(idEditStudent).setAge(checkAgeFormat());
            listStudent.get(idEditStudent).setAddress(inputAddress());
            listStudent.get(idEditStudent).setGender(checkGenderFormat());
            listStudent.get(idEditStudent).setPhoneNumber(checkPhoneNumberFormat());
            FuncFile.writeFile(listStudent);
            System.out.println("Thay đổi thành công");
        } else {
            System.out.println("Mã học sinh không tồn tại");
        }

    }

    @Override
    public void delete() {
        getAllInformationStudent();
        System.out.print("Nhập mã học sinh muốn xóa: ");
        String idDelete = scanner.nextLine();
        if (listStudent.containsKey(idDelete)) {
            listStudent.remove(idDelete);
            FuncFile.writeFile(listStudent);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Mã học sinh không có trong danh sách");
        }
    }

    @Override
    public void addAndEditPoint() {
        System.out.println("Nhập mã học sinh cần nhập điểm: ");
        String idStudent = scanner.nextLine();
        float enterPoint1 = inputPoint1();
        float enterPoint2 = inputPoint2();
        float enterPoint3 = inputPoint3();
        float enterPoint4 = inputPoint4();
        Student student = new Student(enterPoint1, enterPoint2, enterPoint3, enterPoint4);
        if (listStudent.containsKey(idStudent)) {
            listStudent.get(idStudent).setPoint1(enterPoint1);
            listStudent.get(idStudent).setPoint2(enterPoint2);
            listStudent.get(idStudent).setPoint3(enterPoint3);
            listStudent.get(idStudent).setPoint4(enterPoint4);
            listStudent.get(idStudent).getAverage();
            listStudent.put(idStudent, listStudent.get(idStudent));
            FuncFile.writeFile(listStudent);
            System.out.println("Nhập điểm thành công");
        } else {
            System.out.println("Không có mã học sinh trong danh sách");
        }
    }

    @Override
    public void sortStudent() {
        List<Student> sortList = new ArrayList<>(listStudent.values());
        Collections.sort(sortList);
        for (Student student : sortList){
            System.out.println("--------------------------------------------------");
            System.out.println("Mã học sinh: " + student.getIdStudent());
            System.out.println("Tên học sinh: " + student.getStudentName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Địa chỉ: " + student.getAddress());
            System.out.println("Giới tính: " + student.getGender());
            System.out.println("Số điện thoại: " + student.getPhoneNumber());
            System.out.println("Điểm hệ số 1: " + student.getPoint1());
            System.out.println("Điểm hệ số 1: " + student.getPoint2());
            System.out.println("Điểm hệ số 2: " + student.getPoint3());
            System.out.println("Điểm hệ số 3: " + student.getPoint4());
            System.out.println("Điểm tổng kết: " + student.getAverage());
            System.out.println("--------------------------------------------------");
        }
//        Collections.sort(sortList, new SortStudentByPoint());
//        FuncFile.writeFile(listStudent);
//        getAllInformationStudent();
    }

    @Override
    public void getAllInformationStudent() {
        listStudent = FuncFile.readFile();
        for (Student student : listStudent.values()) {
            System.out.println("--------------------------------------------------");
            System.out.println("Mã học sinh: " + student.getIdStudent());
            System.out.println("Tên học sinh: " + student.getStudentName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Địa chỉ: " + student.getAddress());
            System.out.println("Giới tính: " + student.getGender());
            System.out.println("Số điện thoại: " + student.getPhoneNumber());
            System.out.println("Điểm hệ số 1: " + student.getPoint1());
            System.out.println("Điểm hệ số 1: " + student.getPoint2());
            System.out.println("Điểm hệ số 2: " + student.getPoint3());
            System.out.println("Điểm hệ số 3: " + student.getPoint4());
            System.out.println("Điểm tổng kết: " + student.getAverage());
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public String checkIdFormat() {
        String idStudent;
        String regex = "^[a-z 0-9]{2,}$";
        while (true) {
            System.out.print("Nhập mã học sinh: ");
            idStudent = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(idStudent).find()) {
                return idStudent;
            } else {
                System.out.println("Mã học sinh không đúng định dạng");
            }
        }
    }


    @Override
    public String checkNameFormat() {
        String studentName;
        String regex = "^[a-z A-Z]+$";
        while (true) {
            System.out.print("Nhập tên học sinh: ");
            studentName = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(studentName).find()) {
                return studentName;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        }
    }

    @Override
    public String checkAgeFormat() {
        String Age;
        String regex = "^[0-9]{2}$";
        while (true) {
            System.out.print("Nhập tuổi học sinh: ");
            Age = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(Age).find()) {
                return Age;
            } else {
                System.out.println("Tuổi không đúng định dạng");
            }
        }
    }

    @Override
    public String inputAddress() {
        System.out.print("Nhập địa chỉ: ");
        return scanner.nextLine();
    }

    @Override
    public String checkGenderFormat() {
        String gender;
        String regex = "^nam$|^nu$";
        while (true) {
            System.out.print("Nhập giới tính học sinh: ");
            gender = scanner.nextLine();
            Pattern patternId = Pattern.compile(regex);
            if (patternId.matcher(gender).find()) {
                return gender;
            } else {
                System.out.println("Giới tính không đúng định dạng");
            }
        }
    }

    @Override
    public String checkPhoneNumberFormat() {
        String phoneNumber;
        String regex = "^(08|09|03|07|)([0-9]{8})$";
        while (true) {
            System.out.print("Nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
            Pattern patternPhoneNumber = Pattern.compile(regex);
            if (patternPhoneNumber.matcher(phoneNumber).find()) {
                return phoneNumber;
            } else {
                System.out.println("Số điện thoại không đúng định dạng.");
            }
        }
    }

    @Override
    public float inputPoint1() {
        System.out.println("Nhập điểm lần 1: ");
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float inputPoint2() {
        System.out.println("Nhập điểm lần 2: ");
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float inputPoint3() {
        System.out.println("Nhập điểm lần 3: ");
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float inputPoint4() {
        System.out.println("Nhập điểm lần 4: ");
        return Float.parseFloat(scanner.nextLine());
    }


    @Override
    public boolean checkIdStudent(String idStudent) {
        listStudent = FuncFile.readFile();
        for (Student student : listStudent.values()) {
            if (student.getIdStudent().equals(idStudent)) {
                return false;
            }
        }
        return true;
    }


}
