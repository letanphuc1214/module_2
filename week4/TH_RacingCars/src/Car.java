//import com.sun.tools.javac.Main;
//
//import java.util.Random;
//
//import static com.sun.tools.javac.Main.*;
//
//public class Car implements Runnable {
////    private static final int DISTANCE = 100;
////    private static final int STEP = 2;
//    private String name;
//
//    public Car(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        int runDistance = 0;
//        long startTime = System.currentTimeMillis();
//        while (runDistance < Main.DISTANCE) {
//            try {
//                int speed = (new Random()).nextInt(20);
//                runDistance += speed;
//                String log = "|";
//                int percenTravel = (runDistance * 100) / DISTANCE;
//                for (int i = 0; i < DISTANCE; i += STEP) {
//                    if (percenTravel >= i + STEP) {
//                        log += "=";
//                    } else if (percenTravel >= i && percenTravel < i + STEP) {
//                        log += "o";
//                    } else {
//                        log += "-";
//                    }
//                }
//                log += "|";
//                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Car" + this.name + " broken .....");
//                break;
//            }
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("car" + this.name + " finish in " + (endTime - startTime) / 1000 + "s");
//    }
//}
