public class Square extends Rectangle{
    public double side = 1.0;
    public Square(){};

    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(width);
        super.setHeight(height);
    }

    public void setWidth(double side){
        this.width = side;
    }
    public void setHeight(double side){
        this.height = side;
    }

    @Override
    public String toString() {
        return " Square: " +
                "side = " + side +
                " " + super.toString();
    }
}
