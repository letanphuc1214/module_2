import java.util.Arrays;
import java.util.Comparator;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle(5.0d, 6.0d, "white", false);
        rectangles[1] = new Rectangle(7.0d, 8.0d, "pink", true);
        rectangles[2] = new Rectangle(9.0d, 10.0d, "purple", false);
        rectangles[3] = new Rectangle(1.0d, 3.0d, "blue", true);
        rectangles[4] = new Rectangle(20.0d, 30.0d, "yellow", false);

        System.out.println("Pre-sorted: ");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }

        Comparator comparator = new ComparableRectangle();
        Arrays.sort(rectangles, comparator);

        System.out.println("After-sorted: ");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }
    }
}
