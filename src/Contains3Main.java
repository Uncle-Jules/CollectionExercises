import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 4th Edition Ch. 11, Exercise 12
public class Contains3Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Bob");
        list.add("Bob");
        list.add("Bob");
        list.add("Ann");
        list.add("Jones");
        list.add("Jones");
        list.add("Damien");
        list.add("Damien");

        System.out.println(list);
        System.out.println(contains3(list));

    }

    public static boolean contains3(List<String> list) {
        int occurences = 0;
        for(String word : list) {
            occurences = Collections.frequency(list, word);
            if(occurences == 3) {
                return true;
            }
        }

        return false;
    }
}
