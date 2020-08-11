public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.0);
        System.out.println(circle);

        circle = new Circle(5.0, "black", true);
        System.out.println(circle);

    }
}
