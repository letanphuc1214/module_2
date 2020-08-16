import java.util.Comparator;

public class ComparableSquare implements Comparator<Square> {
    @Override
    public int compare(Square o1, Square o2) {
        if (o1.getArea() > o2.getArea()) return 1;
        else if (o1.getArea() < o2.getArea()) return -1;
        else return 0;
    }
}
