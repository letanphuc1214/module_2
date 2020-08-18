import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle1() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle2() {
        int sideA = 1;
        int sideB = 2;
        int sideC = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle3() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle4() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle5() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangle6() {
        int sideA = 3;
        int sideB = 1;
        int sideC = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}