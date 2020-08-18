import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

//    @Test
//    void translate() {
//        int number = 10;
//        String expected = "buzz";
//        String result = FizzBuzzTranslate.translate(number);
//        assertEquals(expected, result);
//    }
//    @Test
//    void translate1() {
//        int number = 7;
//        String expected = "number: " + number;
//        String result = FizzBuzzTranslate.translate(number);
//        assertEquals(expected, result);
//    }
//    @Test
//    void translate2() {
//        int number = 9;
//        String expected = "fizz";
//        String result = FizzBuzzTranslate.translate(number);
//        assertEquals(expected, result);
//    }

    @Test
    void containTranslate() {
        String number = "93";
        String expected = "chinfizz";
        String result = "";
        for (int i = 0; i < number.length(); i++){
            result += FizzBuzzTranslate.containTranslate(String.valueOf(number.charAt(i)));
        }
        assertEquals(expected, result);
    }

    @Test
    void containTranslate1() {
        String number = "59";
        String expected = "buzzchin";
        String result = "";
        for (int i = 0; i < number.length(); i++){
            result += FizzBuzzTranslate.containTranslate(String.valueOf(number.charAt(i)));
        }

        assertEquals(expected, result);
    }
    @Test
    void containTranslate2() {
        String number = "20";
        String expected = "haikhong";
        String result = "";
        for (int i = 0; i < number.length(); i++){
            result += FizzBuzzTranslate.containTranslate(String.valueOf(number.charAt(i)));
        }
        assertEquals(expected, result);
    }
}