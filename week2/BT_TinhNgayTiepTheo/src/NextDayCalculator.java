import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NextDayCalculator {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap ngay: ");
//        int day = scanner.nextInt();
//        System.out.println("nhap thang: ");
//        int month = scanner.nextInt();
//        System.out.println("nhap nam: ");
//        int year = scanner.nextInt();
//        System.out.println(dayCalculator(day,month,year));
//    }
    public static String dayCalculator(int day, int month, int year) {


        int endDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                endDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                endDay = 30;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    endDay = 29;

                } else endDay = 28;
                break;
            default:
                endDay = 0;
        }
        if (day == endDay) {
            if (month == 12) {
                day = 1;
                month = 1;
                year += 1;
            } else {
                day = 1;
                month += 1;
            }
        } else day += 1;


        return day + "/" + month + "/" + year;

    }
}
