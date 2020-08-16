public class ComparableSquare extends Square implements Comparable<ComparableSquare>{
    public ComparableSquare(){};

    public ComparableSquare(double side){
        super(side);
    }

    public ComparableSquare(double side, String color, boolean filled){
        super(side, color, filled);
    }

    @Override
    public int compareTo(ComparableSquare o) {
        if (getSide() > o.getSide()){
            return 1;
        }
        else if (getSide() < o.getSide()){
            return  -1;
        }
        else return 0;
    }
}
