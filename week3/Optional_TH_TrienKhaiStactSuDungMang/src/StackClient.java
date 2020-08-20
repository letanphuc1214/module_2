import java.util.Stack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(10);
        stack.push(3);
        stack.push(7);
        stack.push(33);
        stack.push(66);
        stack.push(88);
        stack.push(99);
        stack.push(55);
        stack.push(22);

        System.out.println("kich thuoc cua ngan xep sau khi them vao: " + stack.size());
        System.out.println("phan tu xoa tu ngan xep: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("kich thuoc cua ngan xep sau khi xoa la: " + stack.size());



    }
}
