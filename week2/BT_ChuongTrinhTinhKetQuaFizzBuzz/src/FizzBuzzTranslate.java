public class FizzBuzzTranslate {
//    public static String translate(int number) {
//        if (number > 0 && number % 3 == 0) return "fizz";
//        if (number > 0 && number % 5 == 0) return "buzz";
//        if (number > 0 && number % 3 == 0 && number % 5 == 0) return "fizzbuzz";
//        return "number: " + number;
//    }

    public static String containTranslate(String number) {
        String result = switch (number) {
            case "0" -> "khong";
            case "1" -> "mot";
            case "2" -> "hai";
            case "3" -> "fizz";
            case "4" -> "bon";
            case "5" -> "buzz";
            case "6" -> "sau";
            case "7" -> "bay";
            case "8" -> "tam";
            case "9" -> "chin";
            default -> "";
        };
        return result;
    }

}
