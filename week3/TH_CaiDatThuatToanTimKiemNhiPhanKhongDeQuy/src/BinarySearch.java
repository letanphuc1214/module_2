public class BinarySearch {
    static int[] list = {5, 8, 3, 4, 2, 9, 6, 77, 1, 22, 45, 82, 33, 14, 44};

    public static void insertSort(int[] list) {
        for (int k = 1; k < list.length; k++) {
            int currentElement = list[k];
            int i;
            for (i = k - 1; i >= 0 && list[i] > currentElement; i--) {
                list[i + 1] = list[i];
            }
            list[i + 1] = currentElement;
        }
    }

    public static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (right >= left){
            int mid = left + (right - left)/2;
            if (list[mid] == key){
                return mid;
            }
            if (list[mid] < key){
                left = mid + 1;
            }
            else right = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        insertSort(list);
        System.out.print("Mang duoc sap xep la: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        System.out.println(binarySearch(list, 2));
    }
}
