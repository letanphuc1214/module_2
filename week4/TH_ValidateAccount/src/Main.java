public class Main {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde "};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount){
            boolean isValidAcount = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValidAcount);
        }
        for (String account : invalidAccount){
            boolean isInValidAccount = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isInValidAccount);
        }
    }
}
