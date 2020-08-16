public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    public ComparableRectangle(){};

    public ComparableRectangle(double width, double height){
        super(width, height);
    }
    public ComparableRectangle(double width, double height, String color, boolean filled){
        super(width, height, color, filled);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()){
            return 1;
        }
        else if (getArea() < o.getArea()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
