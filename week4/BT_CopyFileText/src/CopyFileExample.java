import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {

        File sourch = new File("sourchfile.txt");
        File target = new File("targetfile.txt");

        if (!sourch.exists()) {
            System.out.println("file does not exists");
        }
        if (target.exists()) {
            System.out.println("file does exists");
            boolean isDelete = target.delete();
        } else {
            InputStream inputStream = null;
            OutputStream outputStream = null;


            try {
                inputStream = new FileInputStream(new File("sourchfile.txt"));
                outputStream = new FileOutputStream((new File("targetfile.txt")));
                int length;
                int count = 0;
                byte[] buffer = new byte[inputStream.available()];
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                    count = count + length;
                }
                System.out.println("File is copied successfull!");
                System.out.println(count + " ky tu");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                inputStream.close();
                outputStream.close();
            }

        }

    }
}
