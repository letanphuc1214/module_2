import java.util.Random;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100km/h");
        thread1.start();
        thread2.start();
        thread3.start();
    }
    static class Car implements Runnable {
        //    private static final int DISTANCE = 100;
//    private static final int STEP = 2;
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int runDistance = 0;
            long startTime = System.currentTimeMillis();
            while (runDistance < Main.DISTANCE) {
                try {
                    int speed = (new Random()).nextInt(20);
                    runDistance += speed;
                    String log = "|";
                    int percenTravel = (runDistance * 100) / DISTANCE;
                    for (int i = 0; i < DISTANCE; i += STEP) {
                        if (percenTravel >= i + STEP) {
                            log += "=";
                        } else if (percenTravel >= i && percenTravel < i + STEP) {
                            log += "o";
                        } else {
                            log += "-";
                        }
                    }
                    log += "|";
                    System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Car" + this.name + " broken .....");
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("car" + this.name + " finish in " + (endTime - startTime) / 1000 + "s");
        }
    }
}
