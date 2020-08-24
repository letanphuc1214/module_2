
public class BubbleSort {
    static int[] list = {6, 1, 7, 3, 9, 5, -2, 8, 4};
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if(list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        System.out.print("mang duoc sap xep la: ");
        for (int i = 0; i< list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
