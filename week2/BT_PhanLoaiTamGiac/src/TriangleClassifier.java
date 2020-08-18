public class TriangleClassifier {
    public static String Triangle(int sideA, int sideB, int sideC) {
        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            if ((sideA == sideB) && (sideB == sideC) && (sideA == sideC)) {
                return "tam giac deu";
            } else  if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
                return "tam giac can";
            } else return "tam giac thuong";

        }
        else return "khong phai tam giac";
    }
}
