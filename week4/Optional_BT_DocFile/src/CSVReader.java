import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        File file = new File("textfile.csv");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c!= -1){
            System.out.print((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();

    }
}
