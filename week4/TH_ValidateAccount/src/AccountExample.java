import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String regex = "^[_a-z0-9]{6,}$";
    public AccountExample(){
        pattern = Pattern.compile(regex);
    }
    public boolean validate (String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
