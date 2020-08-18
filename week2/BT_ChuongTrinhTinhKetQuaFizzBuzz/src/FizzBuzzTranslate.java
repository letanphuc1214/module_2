public class FizzBuzzTranslate {
    public static String translate(int number){
        if (number > 0 && number % 3 == 0) return "fizz";
        if (number > 0 && number % 5 == 0) return "buzz";
        if (number > 0 && number % 3 == 0 && number % 5 == 0) return "fizzbuzz";
        return "number: " + number;
    }
}
