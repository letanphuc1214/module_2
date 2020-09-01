public class Main {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] isvalidPhoneNumber = new String[]{"(84)-(0978489648)", "(84)-(0856465456)"};
    public static final String[] isInvalidPhoneNumber = new String[]{"(45)-(2132132132", "(546)-(312)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : isvalidPhoneNumber) {
            boolean isPhoneNumber =phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid " + isPhoneNumber);
        }
        for (String phoneNumber : isInvalidPhoneNumber){
            boolean isInvalidPhoneNumber = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid " + isInvalidPhoneNumber);
        }
    }
}
