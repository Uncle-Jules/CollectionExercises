import java.util.HashSet;
import java.util.Set;

// 4th Edition Ch. 11, Exercise 10
public class EvenLengthRemover {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Bob");
        set.add("Anna");
        set.add("Chad");
        set.add("Brad");
        set.add("Mike");
        set.add("Alex");
        set.add("Joel");
        set.add("Emma");
        set.add("Gerda");
        set.add("Asta");
        set.add("Ammad");

        System.out.println(set);

        removeEvenLength(set);

        System.out.println(set);
    }

    public static void removeEvenLength(Set<String> set) {
        set.removeIf(word -> word.length() % 2 == 0);
    }
}
