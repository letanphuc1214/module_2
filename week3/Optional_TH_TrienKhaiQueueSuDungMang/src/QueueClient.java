public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);
        queue.enQueue(5);
        queue.enQueue(11);
        queue.enQueue(9);
        queue.enQueue(33);
        queue.enQueue(64);
        queue.enQueue(71);


        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        




    }
}
