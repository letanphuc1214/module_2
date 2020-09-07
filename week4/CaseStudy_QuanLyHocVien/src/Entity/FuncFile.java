package Entity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;


public class FuncFile {
    private static final String FILE_NAME_STUDENT = "src/FileUntil/Text";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "Ma hoc sinh , Ten hoc sinh , Tuoi , Dia chi , Gioi tinh , So dien thoai , Diem he so 1 , Diem he so 1 , Diem he so 2 , Diem he so 3, Diem trung binh";
    public static void writeFile(HashMap<String, Student> listStudent) {
        FileWriter fileWriter = null;
        try {
            File file = new File(FILE_NAME_STUDENT);
            fileWriter = new FileWriter(file);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for (Student student : listStudent.values()) {
                fileWriter.append(student.getIdStudent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getStudentName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAge());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getPoint1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getPoint2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getPoint3()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getPoint4()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getAverage()));
                fileWriter.append(NEW_LINE_SEPERATOR);
            }
        } catch (Exception e) {
            System.out.println("Lỗi ở file !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Lỗi khi xóa và đóng ");
            }

        }

    }

    public static HashMap<String, Student> readFile() {
        BufferedReader br = null;
        HashMap<String, Student> listStudent = new HashMap<>();
        Path path = Paths.get(FILE_NAME_STUDENT);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_NAME_STUDENT);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_STUDENT));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals("Ma hoc sinh ")) {
                    continue;
                }
                Student student = new Student();
                student.setIdStudent(data[0]);
                student.setStudentName(data[1]);
                student.setAge((data[2]));
                student.setAddress(data[3]);
                student.setGender(data[4]);
                student.setPhoneNumber((data[5]));
                student.setPoint1(Float.parseFloat(data[6]));
                student.setPoint2(Float.parseFloat(data[7]));
                student.setPoint3(Float.parseFloat(data[8]));
                student.setPoint4(Float.parseFloat(data[9]));
                listStudent.put(student.idStudent, student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listStudent;
    }
}
