import java.util.Scanner;
public class isLeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYears = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYears = true;
                }
            } else {
                isLeapYears = true;
            }
        }

        if(isLeapYears){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
