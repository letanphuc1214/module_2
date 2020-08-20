public class MyQueue {
    public int capacity;
    public int queueArr[];
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            return true;
        }
        return status;
    }

    public void enQueue(int item){
        if (isQueueFull()){
            System.out.println("Full khong the them phan tu: " + item);
        }
        else {
            tail++;
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phan tu " + item + " duoc them vao");
        }
    }
    public void deQueue(){
        if (isQueueEmpty()){
            System.out.println("Rong! khong the xoa phan tu hang doi");
        }
        else {
            head++;
            if (head == capacity - 1){
                System.out.println("Da xoa thanh cong! Loai bo: " + queueArr[head - 1]);
                head = 0;
            }
            else {
                System.out.println("Da xoa thanh cong! Loai bo: " + queueArr[head - 1]);

            }
            currentSize--;
        }
    }
}
