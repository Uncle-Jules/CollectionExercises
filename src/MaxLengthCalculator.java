import java.util.*;

// 4th Edition Ch. 11, Exercise 8
public class MaxLengthCalculator {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
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

        System.out.println(maxLength(set));

    }

    public static int maxLength(Set<String> set) {

        String longestWord = "";
        for(String word : set) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord.length();
    }
}
