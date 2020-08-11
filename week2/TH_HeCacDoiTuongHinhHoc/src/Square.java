public class Square extends Rectangle{
    Square(double side){
        super(side, side);
    }
    Square(double side, String color, boolean filled){
        super(side, side, color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    public void setHeight(double side) {
        this.height = side;
    }

    public String toString(){
        return "A Square with side= " +getSide()+ ", which is a subclass of " + super.toString();
    }

}
