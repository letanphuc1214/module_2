import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = myArray.length;
        for (int i = 0; i < size; i++){
            stack.push(myArray[i]);
        }
        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++){
            reverseArray[i] = stack.pop();
        }
        System.out.println("Reverse array is: " + Arrays.toString(reverseArray));
    }
}
