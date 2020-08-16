import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[5];
        rectangles[0] = new ComparableRectangle(5.0d, 6.0d, "white", false);
        rectangles[1] = new ComparableRectangle(7.0d, 8.0d, "pink", true);
        rectangles[2] = new ComparableRectangle(9.0d, 10.0d, "purple", false);
        rectangles[3] = new ComparableRectangle(1.0d, 3.0d, "blue", true);
        rectangles[4] = new ComparableRectangle(20.0d, 30.0d, "yellow", false);

        System.out.println("Pre-sorted: ");
        for (ComparableRectangle rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted: ");
        for (ComparableRectangle rectangle : rectangles){
            System.out.println(rectangle.getArea());
        }
    }
}
