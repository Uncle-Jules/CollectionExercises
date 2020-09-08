import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 4th Edition Ch. 11, Exercise 13
public class UniqueMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("a", "Bob");
        map.put("b", "Ann");
        map.put("c", "Mike");
        map.put("d", "Jones");
        map.put("e", "Ole");
        map.put("f", "Boyd");
        map.put("g", "Cal");
        map.put("h", "Ray");
        map.put("i", "Jay");
        map.put("j", "May");

        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {

        int occurences = 0;
        for(Map.Entry<String, String> entry : map.entrySet()) {
            occurences = Collections.frequency(map.values(), entry.getValue());
            if(occurences == 2) {
                return false;
            }
        }

        return true;
    }
}
