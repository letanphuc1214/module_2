public class TriangleClassifier {
//    public static String Triangle(int sideA, int sideB, int sideC) {
//        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
//            if ((sideA == sideB) && (sideB == sideC) && (sideA == sideC)) {
//                return "tam giac deu";
//            }
//            else  if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
//                        return "tam giac can";
//                 }
//                else return "tam giac thuong";
//
//        }
//        else return "khong phai tam giac";
//    }
public static final String TAM_GIAC_DEU = "Tam giac deu";
    public static final String TAM_GIAC_CAN = "Tam giac can";
    public static final String KHONG_PHAI_TAM_GIAC = "Khong phai tam giac";
    public static final String TAM_GIAC_THUONG = "Tam giac thuong";
    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return KHONG_PHAI_TAM_GIAC;
        if (a + b <= c || b + c <= a || a + c <= b) return KHONG_PHAI_TAM_GIAC;
        if (a == b && b == c) return TAM_GIAC_DEU;
        if (a == b || b == c || c == a) return TAM_GIAC_CAN;
        return TAM_GIAC_THUONG;
    }
}
