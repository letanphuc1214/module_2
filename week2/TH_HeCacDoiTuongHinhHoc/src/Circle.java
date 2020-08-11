public class Circle extends Shape {
    public double radius = 1.0;
    public Circle(){};
    public Circle(Double radius){
        this.radius = radius;
    }
    public Circle(Double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
