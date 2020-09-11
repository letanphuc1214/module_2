import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncFile {
    private static final String FILE_NAME_STUDENT = "data/contact.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "So dien thoai, Nhom cua danh ba , Ho ten , Gioi tinh  , Dia chi , Ngay sinh , Email";

    public static void writeFile(List<PhoneBook> listPhone) {
        FileWriter fileWriter = null;
        try {
            File file = new File(FILE_NAME_STUDENT);
            fileWriter = new FileWriter(file);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for (PhoneBook phoneBook : listPhone) {
                fileWriter.append(phoneBook.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getGroupPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getDayOfBirth());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(phoneBook.getEmail());
                fileWriter.append(NEW_LINE_SEPERATOR);
            }
        } catch (Exception e) {
            System.out.println("Loi o file !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Loi khi xoa va dong ");
            }

        }

    }

    public static List<PhoneBook> readFile() {
        BufferedReader br = null;
        List<PhoneBook> phoneBooks = new ArrayList<PhoneBook>();
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
                if (data[0].equals("So dien thoai")) {
                    continue;
                }
                PhoneBook phoneBook = new PhoneBook();
                phoneBook.setPhoneNumber(data[0]);
                phoneBook.setGroupPhoneNumber(data[1]);
                phoneBook.setName((data[2]));
                phoneBook.setGender(data[3]);
                phoneBook.setAddress(data[4]);
                phoneBook.setDayOfBirth((data[5]));
                phoneBook.setEmail((data[6]));
                phoneBooks.add(phoneBook);
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
        return phoneBooks;
    }
}
