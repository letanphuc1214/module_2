import java.util.Scanner;

public class SearchValueArray {
    public static void main(String[] args){
        String[] array = {"Phuc", "Long", "Tin", "Nguyen", "Hiep", "Huong"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten vao: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(input_name)){
                System.out.println("vi tri cua " + input_name + " trong danh sach la: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("khong tim thay " + input_name + " trong danh sach");
        }


    }
}
