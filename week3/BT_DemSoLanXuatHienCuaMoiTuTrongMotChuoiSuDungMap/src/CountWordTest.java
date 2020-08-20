import java.util.Map;
import java.util.TreeMap;

public class CountWordTest {

    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static Map<String, Integer> countWords(String input){
        Map<String, Integer> map = new TreeMap<String, Integer>();
        if (input == null) return map;

        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <size; i++){
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE){
                sb.append(input.charAt(i));
            }
            else {
                addWord(map, sb);
                sb = new StringBuilder();
            }
        }
        addWord(map, sb);
        return map;

    }

    public static void addWord(Map<String, Integer> map, StringBuilder sb){
        String word = sb.toString();
        if (word.length() == 0) return;
        if (map.containsKey(word)){
            int count = map.get(word) + 1;
            map.put(word, count);
        }
        else {
            map.put(word, 1);
        }
    }

    public static void main(String[] args) {
        String str = "le tan phuc hien tai dang hoc o codegym va dang hoc ngon ngu java";
        System.out.println("So lan xuat hien cua cac tu trong chuoi la: ");
        Map<String, Integer> map = countWords(str);
        for (String key: map.keySet()) {
            System.out.println(key.toUpperCase() + " " + map.get(key));
        }
    }
}
