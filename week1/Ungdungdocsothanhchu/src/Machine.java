import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap can nang ");
        int weight = scanner.nextInt();
        int check = weight / 10;
        int soDu = weight % 10;
        int check100 = weight / 100;
        int soDu100 = weight % 100;
        int phanChuc = soDu100 / 10;
        int donVi = soDu100 % 10;
        if (weight <= 20) {
            switch (weight) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        } else {
            if (weight < 100) {
                switch (check) {
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("ThirdTy ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }

                switch (soDu) {

                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            } else if (weight < 1000) {
                switch (check100) {
                    case 1:
                        System.out.print("one hundred ");
                        break;
                    case 2:
                        System.out.print("two hundred ");
                        break;
                    case 3:
                        System.out.print("three hundred ");
                        break;
                    case 4:
                        System.out.print("four hundred ");
                        break;
                    case 5:
                        System.out.print("five hundred ");
                        break;
                    case 6:
                        System.out.print("six hundred ");
                        break;
                    case 7:
                        System.out.print("seven hundred ");
                        break;
                    case 8:
                        System.out.print("eight hundred ");
                        break;
                    case 9:
                        System.out.print("nine hundred");
                        break;

                }
                if (soDu100 < 10) {
                    switch (donVi) {
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight ");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }
                } else if (soDu100 < 20 && soDu100 > 10) {
                    switch (donVi) {
                        case 10:
                            System.out.print("ten");
                            break;
                        case 11:
                            System.out.print("eleven");
                            break;
                        case 12:
                            System.out.print("twelve");
                            break;
                        case 13:
                            System.out.print("thirteen");
                            break;
                        case 14:
                            System.out.print("fourteen");
                            break;
                        case 15:
                            System.out.print("fifteen");
                            break;
                        case 16:
                            System.out.print("sixteen");
                            break;
                        case 17:
                            System.out.print("seventeen");
                            break;
                        case 18:
                            System.out.print("eighteen");
                            break;
                        case 19:
                            System.out.print("nineteen");
                            break;
                    }
                }

                switch (phanChuc) {
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("ThirdTy ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }

                switch (donVi) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }

//            } else if (soDu100 < 20) {
//                switch (soDu100) {
//                    case 2:
//                        System.out.println("two");
//                        break;
//                    case 3:
//                        System.out.println("three");
//                        break;
//                    case 4:
//                        System.out.println("four");
//                        break;
//                    case 5:
//                        System.out.println("five");
//                        break;
//                    case 6:
//                        System.out.println("six");
//                        break;
//                    case 7:
//                        System.out.println("seven");
//                        break;
//                    case 8:
//                        System.out.println("eight");
//                        break;
//                    case 9:
//                        System.out.println("nine");
//                        break;
//                    case 10:
//                        System.out.println("ten");
//                        break;
//                }
//            }
            }
        }
    }
}
//if (soDu100 < 10) {
//        switch (donVi) {
//        case 1:
//        System.out.print("one");
//        break;
//        case 2:
//        System.out.print("two");
//        break;
//        case 3:
//        System.out.print("three");
//        break;
//        case 4:
//        System.out.print("four");
//        break;
//        case 5:
//        System.out.print("five");
//        break;
//        case 6:
//        System.out.print("six");
//        break;
//        case 7:
//        System.out.print("seven");
//        break;
//        case 8:
//        System.out.print("eight ");
//        break;
//        case 9:
//        System.out.print("nine");
//        break;
//        }
//        } else if (soDu100 >= 10 || soDu100 < 20){
//        switch (donVi) {
//        case 10:
//        System.out.print("ten");
//        break;
//        case 11:
//        System.out.print("eleven");
//        break;
//        case 12:
//        System.out.print("twelve");
//        break;
//        case 13:
//        System.out.print("thirteen");
//        break;
//        case 14:
//        System.out.print("fourteen");
//        break;
//        case 15:
//        System.out.print("fifteen");
//        break;
//        case 16:
//        System.out.print("sixteen");
//        break;
//        case 17:
//        System.out.print("seventeen");
//        break;
//        case 18:
//        System.out.print("eighteen");
//        break;
//        case 19:
//        System.out.print("nineteen");
//        break;
//        }
//        }