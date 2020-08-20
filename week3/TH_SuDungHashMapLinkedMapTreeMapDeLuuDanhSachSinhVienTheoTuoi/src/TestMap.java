import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("phuc", 1);
        hashMap.put("hiep", 2);
        hashMap.put("nguyen", 3);
        hashMap.put("tin", 4);
        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 075f, true);
        linkedHashMap.put("phuc", 1);
        linkedHashMap.put("hiep", 2);
        linkedHashMap.put("nguyen", 3);
        linkedHashMap.put("tin", 4);
        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        



    }
}
