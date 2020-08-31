import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String COMMA_SPACE = " ";
    private static final String NEW_LINE_SEPERATOR = "\n";
    private static final String FILE_HEADER_PRODUCT = "Ma San Pham =  , Ten San Pham2 = , Nha San Xuat = , Gia San Pham = , Mo ta = ";
    private static final String fileProduct = "source";

    public static void writeProductCSVFile(ArrayList<Product> listProduct){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileProduct);
            fileWriter.append(FILE_HEADER_PRODUCT);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for (Product product : listProduct){
                fileWriter.append(product.getProductCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getProductName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getManufacturer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getPrice());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(COMMA_SPACE);
                fileWriter.append(product.getDescription());
                fileWriter.append(NEW_LINE_SEPERATOR);
            }
        }
        catch (Exception e){
            System.out.println("Loi o CSVFile !!!");
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (Exception ex){
                System.out.println("Loi khi xoa va dong ");
            }

        }

    }

    public static ArrayList<Product> getFileCSVListProduct(){
        BufferedReader br = null;
        ArrayList<Product> listProduct = new ArrayList<Product>();
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
                String[] data = line.split( ",");
                if (data[0].equals("Ma San Pham =  ")){
                    continue;
                }
                Product product = new Product();
                product.setProductCode(data[0]);
                product.setProductName(data[1]);
                product.setManufacturer(data[2]);
                product.setPrice(data[3]);
                product.setDescription(data[4]);
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
