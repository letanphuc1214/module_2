public class SelectionSort {
   static int[] list = {8,1,5,3,9,-6,2};

   public static void selectionSort(int[] list){
       for (int i = 0; i < list.length - 1; i++){
           int currentMin = list[i];
           int currentMinIndex = i;

           for (int j = i + 1; j < list.length; j++){
               if (list[j] < currentMin){
                   currentMin = list[j];
                   currentMinIndex = j;
               }
           }
           if (currentMinIndex != i){
               list[currentMinIndex] = list[i];
               list[i] = currentMin;
           }
       }
   }

    public static void main(String[] args) {
        selectionSort(list);
//        System.out.print("mang duoc sap xep la: ");
        for (int i  = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
//        System.out.println();
    }

}