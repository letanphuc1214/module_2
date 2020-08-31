import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String regex = "^(C|A|P)([0-9]{4})(G|H|I|K|L|M)$";

    public RegularExpression() {
        pattern = Pattern.compile(regex);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
