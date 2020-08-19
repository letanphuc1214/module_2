import org.w3c.dom.Node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList listLinked = new MyLinkedList(1);
        listLinked.add(1,5);
        listLinked.add(2, 10);
        listLinked.add(3, 113);
        listLinked.add(4, 114);

        listLinked.addFirst(11);
        listLinked.addFirst(12);
        listLinked.addFirst(13);
        listLinked.addFirst(14);

        listLinked.printList();


    }
}
