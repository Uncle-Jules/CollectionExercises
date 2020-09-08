import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 4th Edition Ch. 11, Exercise 11
public class SymmetricDiffSetter {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        fillSet(set1);
        fillSet(set2);

        Set<Integer> diffSet = symmetricSetDifference(set1, set2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(diffSet);
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diffSet = new HashSet<>();
        for(int num : set1) {
            if(!set2.contains(num)) {
                diffSet.add(num);
            }
        }
        return diffSet;
    }

    public static void fillSet(Set<Integer> set) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rand.nextInt(10));
        }
    }
}
