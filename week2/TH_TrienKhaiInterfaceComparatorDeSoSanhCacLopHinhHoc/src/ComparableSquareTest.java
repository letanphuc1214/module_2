import java.util.Arrays;
import java.util.Comparator;

public class ComparableSquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(5.0d, "red", true);
        squares[1] = new Square(7.0d, "blue", false);
        squares[2] = new Square(3.0d, "yellow", true);

        System.out.println("Pre-sorted: ");
        for (Square square : squares) {
            System.out.println(square);
        }

        Comparator comparator = new ComparableSquare();
        Arrays.sort(squares, comparator);

        System.out.println("After-sorted: ");
        for (Square square: squares){
            System.out.println(square);
        }
    }
}
