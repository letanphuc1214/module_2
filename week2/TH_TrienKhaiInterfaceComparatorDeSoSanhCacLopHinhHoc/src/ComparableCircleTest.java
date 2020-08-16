import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6d);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5d,"grey", true);

        System.out.println("Pre-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator comparator = new ComparableCircle();
        Arrays.sort(circles, comparator);
        System.out.println("After-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

    }
}
