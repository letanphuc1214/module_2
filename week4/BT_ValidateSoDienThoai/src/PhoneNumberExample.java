import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    public static final String regex = "^\\(84\\)\\-\\((08|09|03|07|)([0-9]{8})\\)$";

    public PhoneNumberExample(){
        pattern = Pattern.compile(regex);
    }

    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
