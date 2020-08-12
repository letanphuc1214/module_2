public class Cylinder extends Circle {
    private double height;

    Cylinder() {
    }

    ;

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder { " +
                "height= " + height +
                " , " + super.toString() + " }";
    }
}
