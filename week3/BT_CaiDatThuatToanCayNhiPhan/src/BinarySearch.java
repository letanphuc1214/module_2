public class BinarySearch {
    static int[] list = {8, 2, 1, 3, 9, -5, 4, 99, 44, 77};

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

    public static void main(String[] args) {
        insertSort(list);
        System.out.print(" mang duoc sap xep la: ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print(binarySearch(list, 44, 0, list.length - 1));
    }

    public static int binarySearch(int[] list, int key, int left, int right) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (list[mid] == key) {
                return mid;
            }
            if (list[mid] > key) {
                return binarySearch(list, key, left, mid - 1);
            }
            else {
                return binarySearch(list, key, mid + 1, right);
            }
        }
        return -1;
    }
}
