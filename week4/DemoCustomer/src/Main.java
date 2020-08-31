public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Thread thread1 = new Thread(){
            public void run(){
                customer.rutTien(20000);
            };
        };
        thread1.start();
        Thread thread2 = new Thread(){
            public void run(){
                customer.nopTien(30000);
            }
        };
        thread2.start();
    }

}
