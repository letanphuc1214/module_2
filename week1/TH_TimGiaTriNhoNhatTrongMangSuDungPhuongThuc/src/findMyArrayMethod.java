public class findMyArrayMethod {
    public static void main(String[] args) {
        int[] array = {5, 9, 6, 3, 8, 2, 1, -1};
        minValue(array);
    }

    public static void minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Phan tu nho nhat trong mang la: " + min + " o vi tri thu " + (index + 1));
    }
}
