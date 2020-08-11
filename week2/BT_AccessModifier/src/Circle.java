public class Circle {
    private static Double radius = 1.0;
    private static String Color = "red";
    Circle(){};
    Circle(Double r){
        radius = r;
    }

    public static Double getRadius() {
        return radius;
    }

    public static String getColor() {
        return Color;
    }
    public void display(){
        System.out.println(radius + " " + Color);
    }
}
