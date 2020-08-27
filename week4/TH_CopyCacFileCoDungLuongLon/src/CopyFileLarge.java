import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String sourcePath = scanner.next();
        System.out.print("Enter destination file: ");
        String destPath = scanner.next();

        File sourceFile  = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7File(sourceFile, destFile);
            System.out.println("copy completed");
        } catch (IOException e) {
            System.out.println("can't copy that file");
            System.out.println(e.getMessage());
        }

    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    private static void copyFileUsingJava7File(File source, File dest) throws IOException{
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
