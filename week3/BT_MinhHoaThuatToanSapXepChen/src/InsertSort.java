public class InsertSort {
    static int[] list = {5,9,3,7,2,-4,4,1};

    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] =currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.print("mang da duoc sap xep la: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
