public class Main {
    public static void main(String[] args) {
        NumberGenerator1 t1 = new NumberGenerator1();
        NumberGenerator2 t2 = new NumberGenerator2();


        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);


        thread.start();
        thread1.start();
    }

    static class NumberGenerator1 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException ie){
                    System.err.println(ie.toString());
                }
            }
        }
    }

    static class NumberGenerator2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException ei){
                    System.out.println(ei.toString());
                }
            }
        }
    }
}
