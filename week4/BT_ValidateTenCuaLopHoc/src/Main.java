public class Main {
    private static RegularExpression regularExpression;
    public static final String[] validRoom = new String[] {"C0318G", "A5465H", "P2132I", "C8789K", "A3248L", "P2314M"};
    public static final String[] invalidRoom = new String[] {"M2132G", "B48763C", "N546544", "03215", "6549G"};

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        for (String room : validRoom){
            boolean isvalid = regularExpression.validate(room);
            System.out.println("Room is " + room + " is valid " + isvalid);
        }
        for (String room : invalidRoom){
            boolean isInvalid = regularExpression.validate(room);
            System.out.println("Room is " + room + " is valid " + isInvalid);
        }
    }
}
