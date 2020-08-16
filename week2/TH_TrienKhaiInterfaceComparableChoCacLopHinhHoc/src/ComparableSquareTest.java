import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare(5.0d, "red", true);
        squares[1] = new ComparableSquare(7.0d, "blue", false);
        squares[2] = new ComparableSquare(3.0d, "yellow", true);

        System.out.println("Pre-sorted: ");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }
        Arrays.sort(squares);

        System.out.println("After-sorted: ");
        for (ComparableSquare square: squares){
            System.out.println(square);
        }
    }
}
