import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String COMMA_SPACE = " ";
    private static final String NEW_LINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "Ma san pham = , Ten san pham = , Nha san xuat = , Gia = , Mo ta = ";
    private static final String fileProduct = "Text";

    public static void writeFile (ArrayList<Product> listProduct){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileProduct);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for (Product product : listProduct){
                fileWriter.append(product.getMaSanPham());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getTenSanPham());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getNhaSanXuat());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getGia());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getMoTa());
                fileWriter.append(NEW_LINE_SEPERATOR);
            }

        }
        catch (Exception e){
            System.out.println("loi file ");
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (Exception ex){
                System.out.println("loi khi xoa va dong ");
            }
        }
    }

    public static ArrayList<Product> getFile(){
        BufferedReader br = null;
        ArrayList<Product> listProduct = new ArrayList<>();
        Path path = Paths.get(fileProduct);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(fileProduct);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileProduct));
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                if (data[0].equals("Ma san pham = ")){
                    continue;
                }
                Product product = new Product();
                product.setMaSanPham(data[0]);
                product.setTenSanPham(data[1]);
                product.setNhaSanXuat(data[2]);
                product.setGia(data[3]);
                product.setMoTa(data[4]);
                listProduct.add(product);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        return listProduct;
    }

}
