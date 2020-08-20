public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>(6);
        System.out.println(myList.size);
        myList.add(1, "long");
        myList.add(2, "linh");
        myList.add(5, "quy");
        myList.add(0, "huong");
        myList.add(3, "phuc");
        myList.add(4, "hiep");
        myList.add(6, "tin");
        myList.add(7, "nguyen");
        myList.add(8, "duc");
        myList.add(30, "duc");

//        myList.add(9, "nguyen");
        System.out.println(myList.size);
        for (int i = 0; i < myList.size; i++) {
            System.out.println(myList.get(i));
        }

    }
}
