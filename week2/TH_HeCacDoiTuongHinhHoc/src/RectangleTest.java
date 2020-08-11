public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0, 6.0, "yellow", true);
        System.out.println(rectangle);
    }
}
