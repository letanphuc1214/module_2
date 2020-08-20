import java.util.Arrays;

public class GenericStackClient {

    public static void main(String[] args) {
        System.out.println("1. stack of string");
        stackOfString();

        System.out.println("2. stack of integer");
        stackOfInteger();
    }

    public static void stackOfString(){
        MyGenericStack<String> myStack = new MyGenericStack<String>();
        myStack.push("mot");
        myStack.push("hai");
        myStack.push("ba");
        myStack.push("bon");
        myStack.push("nam");
        myStack.push("sau");


        System.out.println("1.1 Size of stack after push operations: " + myStack.size());

        myStack.pop();
        System.out.println("1.2. Pop elements from stack : " + myStack.size());

    }
    public static void stackOfInteger(){
        MyGenericStack<Integer> myStack = new MyGenericStack<Integer>();
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        System.out.println("1.1 Size of stack after push operations: " + myStack.size());
        myStack.pop();
        System.out.println("1.2. Pop elements from stack : " + myStack.size());

    }



}
