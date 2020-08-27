import java.io.*;

public class MyFileStream {

    public static void main(String[] args) throws IOException{
        MyFileStream myFileStream = new MyFileStream();
        myFileStream.copyBinaryFile();
    }
    public void copyBinaryFile() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("ngoctrinh.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("ngoctrinh2.jpg");

        byte[] buffer = new byte[1024];
        while ((fileInputStream.read(buffer)) > 0) {
            fileOutputStream.write(buffer);
        }
            fileInputStream.close();
            fileOutputStream.close();

        }
}
