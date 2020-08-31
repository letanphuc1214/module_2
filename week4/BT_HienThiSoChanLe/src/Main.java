public class Main {
    public static void main(String[] args) {
        printer print = new printer();
        Thread t1 = new Thread(new oddEvenThread(print, 10, false));
        Thread t2 = new Thread(new oddEvenThread(print, 10, true));
        t1.start();
        t2.start();
    }

    static class oddEvenThread implements Runnable {
        private printer print;
        private int max;
        private boolean isEvenNumber;

        public oddEvenThread( printer print, int max, boolean isEvenNumber) {
            this.print = print;
            this.max = max;
            this.isEvenNumber = isEvenNumber;
        }

        @Override
        public void run() {
            int number = isEvenNumber == true ? 2 : 1;
            while (number <= max) {
                if (isEvenNumber) {
                    print.printEven(number);
                } else {
                    print.printOdd(number);
                }
                number += 2;
            }
        }
    }

    static class printer {
        boolean isOdd = false;

        synchronized void printEven(int number) {
            while (isOdd == false) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + number);
            isOdd = false;
            notifyAll();
        }

        synchronized void printOdd(int number) {
            while (isOdd == true) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + number);
            isOdd = true;
            notifyAll();
        }


    }
}
