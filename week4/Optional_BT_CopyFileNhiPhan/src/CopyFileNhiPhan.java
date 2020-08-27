import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CopyFileNhiPhan {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String sourcePath = scanner.next();
        System.out.println("Enter target file: ");
        String targetPath = scanner.next();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        try {
            copyFileUsingStream(sourceFile, targetFile);
        }
        catch (IOException e){
            System.out.println("can't copy that file");
            System.out.println(e.getMessage());
        }
    }

    public static void copyFileUsingStream(File source, File target) throws IOException {

        if (!source.exists()) {
            System.out.println("file does not exist");
        }
        if (target.exists()) {
            System.out.println("file does exist");
            boolean isDelete = target.delete();
        } else {
            InputStream in = null;
            OutputStream out = null;

            try {
                in = new FileInputStream(new File("optimus.jpg"));
                out = new FileOutputStream(new File("bee.jpg"));
                int length;

                byte[] buffer = new byte[1024];
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);

                }
                System.out.println("file is copied successfull!");
                System.out.println(Arrays.toString(buffer));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close();
                out.close();
            }
        }
    }
}
