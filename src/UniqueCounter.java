import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

// 4th Edition Ch. 11, Exercise 6
public class UniqueCounter {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        fillList(numList);

        System.out.println(numList);

        System.out.println(countUnique(numList));
    }

    public static int countUnique(List<Integer> numList) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < numList.size(); i++) {
            set.add(numList.get(i));
        }
        return set.size();
    }

    public static void fillList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
    }
}
