import java.util.*;

public class CollectionExercises {

    /* Hej Jon
    * Bare udkommentér de metoder i main, som du vil teste.
    * Så kan du teste dem 1 af gangen.
    *
    * Da nogle af opgaverne var forskellige fra 3rd til 4th Edition af Building Java Programs
    * har jeg valgt at lave begge udgaver, du kan selvfølgelig bare skippe dem der ikke virker relevante
    */


    public static void main(String[] args) {

        // 4th Edition Ch. 10, Exercise 1
        arrayListDemoMain();

        // 3rd Edition Ch. 10, Exercise 1
        totalVowelsMain();

        // 4th Edition Ch. 11, Exercise 6
        countUniqueMain();

        // 4th Edition Ch. 11, Exercise 8
        maxLengthMain();

        // 3rd Edition Ch. 11, Exercise 8
        minLengthMain();

        // 4th Edition Ch. 11, Exercise 10
        removeEvenLengthMain();

        // 3rd Edition Ch. 11, Exercise 10
        removeOddLengthMain();

        // 4th Edition Ch. 11, Exercise 11
        symmetricSetDifferenceMain();

        // 4th Edition Ch. 11, Exercise 12
        contains3Main();

        // 4th Edition Ch. 11, Exercise 13
        isUniqueMain();

    }


    // 4th Edition Ch. 10, Exercise 1
    public static void arrayListDemoMain() {
        ArrayList<Integer> numAL = new ArrayList<>();

        fillIntList(numAL);
        System.out.println("Initial array list: " + numAL);
        printLength(numAL);
        removeFirst(numAL);
        System.out.println("Array list after removeFirst: " + numAL);
        System.out.println("Clone: " + cloneAL(numAL));
    }

    public static void printLength(ArrayList<Integer> numAL) {
        System.out.println("Length: " + numAL.size());
    }

    public static void removeFirst(ArrayList<Integer> numAL) {
        numAL.remove(0);
    }

    public static ArrayList cloneAL(ArrayList<Integer> numAL) {
        return (ArrayList)numAL.clone();
    }


    // 3rd Edition Ch. 10, Exercise 1
    public static void totalVowelsMain() {
        ArrayList<String> stringAL = new ArrayList<>();

        stringAL.add("Bob");
        stringAL.add("Ann");
        stringAL.add("Mary");
        stringAL.add("Mike");
        stringAL.add("Cal");
        stringAL.add("Moe");
        stringAL.add("Barry");
        stringAL.add("Klein");
        System.out.println("Number of vowels: " + totalVowels(stringAL));;

    }

    public static int totalVowels(ArrayList<String> stringAL) {

        String vowels = "aeiouyæøå";
        int count = 0;
        for(String word : stringAL) {
            for (int i = 0; i < word.length(); i++) {
                if(vowels.indexOf(word.toLowerCase().charAt(i)) > -1) {
                    count++;
                }
            }
        }
        return count;
    }


    // 4th Edition Ch. 11, Exercise 6
    public static void countUniqueMain() {
        ArrayList<Integer> numAL = new ArrayList<>();

        fillIntList(numAL);
        System.out.println("Initial array list: " + numAL);
        System.out.println("Unique integers: " + countUnique(numAL));
    }

    public static int countUnique(List<Integer> numList) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < numList.size(); i++) {
            set.add(numList.get(i));
        }
        return set.size();
    }


    // 4th Edition Ch. 11, Exercise 8
    public static void maxLengthMain() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Bob");
        stringSet.add("Anna");
        stringSet.add("Chad");
        stringSet.add("Brad");
        stringSet.add("Mike");
        stringSet.add("Alex");
        stringSet.add("Joel");
        stringSet.add("Emma");
        stringSet.add("Gerda");
        stringSet.add("Asta");
        stringSet.add("Ammad");
        System.out.println("Longest word: " + maxLength(stringSet) + " characters.");
    }

    public static int maxLength(Set<String> stringSet) {

        int longestLength = 0;
        for(String word : stringSet) {
            if (word.length() > longestLength) {
                longestLength = word.length();
            }
        }

        return longestLength;
    }


    // 3rd Edition Ch. 11, Exercise 8
    public static void minLengthMain() {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Bob");
        stringSet.add("Anna");
        stringSet.add("Chad");
        stringSet.add("Brad");
        stringSet.add("Mike");
        stringSet.add("Alex");
        stringSet.add("Joel");
        stringSet.add("Emma");
        stringSet.add("Gerda");
        stringSet.add("Asta");
        stringSet.add("Ammad");
        System.out.println("Shortest word: " + minLength(stringSet) + " characters.");
    }

    public static int minLength(Set<String> stringSet) {

        if(stringSet.isEmpty()) {
            return 0;
        }

        Iterator<String> iterator = stringSet.iterator();
        int shortestLength = iterator.next().length();
        int newLength = 0;
        while(iterator.hasNext()) {
            newLength = iterator.next().length();
            if (newLength < shortestLength) {
                shortestLength = newLength;
            }
        }

        return shortestLength;
    }


    // 4th Edition Ch. 11, Exercise 10
    public static void removeEvenLengthMain() {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Bob");
        stringSet.add("Anna");
        stringSet.add("Chad");
        stringSet.add("Brad");
        stringSet.add("Mike");
        stringSet.add("Alex");
        stringSet.add("Joel");
        stringSet.add("Emma");
        stringSet.add("Gerda");
        stringSet.add("Asta");
        stringSet.add("Ammad");
        System.out.println("Initial set: " + stringSet);
        removeEvenLength(stringSet);
        System.out.println("Modified set " + stringSet);
    }

    public static void removeEvenLength(Set<String> set) {
        set.removeIf(word -> word.length() % 2 == 0);
    }


    // 3rd Edition Ch. 11, Exercise 10
    public static void removeOddLengthMain() {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Bob");
        stringSet.add("Anna");
        stringSet.add("Chad");
        stringSet.add("Brad");
        stringSet.add("Mike");
        stringSet.add("Alex");
        stringSet.add("Joel");
        stringSet.add("Emma");
        stringSet.add("Gerda");
        stringSet.add("Asta");
        stringSet.add("Ammad");
        System.out.println("Initial set: " + stringSet);
        removeOddLength(stringSet);
        System.out.println("Modified set " + stringSet);
    }

    public static void removeOddLength(Set<String> set) {
        set.removeIf(word -> word.length() % 2 != 0);
    }


    // 4th Edition Ch. 11, Exercise 11
    public static void symmetricSetDifferenceMain() {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        fillIntSet(set1);
        fillIntSet(set2);

        Set<Integer> diffSet = symmetricSetDifference(set1, set2);

        System.out.println("First set: " + set1);
        System.out.println("Second set: " + set2);
        System.out.println("Symmetric difference set: " + diffSet);
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> diffSet = new HashSet<>();

        for(int num : set1) {
            if(!set2.contains(num)) {
                diffSet.add(num);
            }
        }

        for(int num : set2) {
            if(!set1.contains(num)) {
                diffSet.add(num);
            }
        }

        return diffSet;
    }


    // 4th Edition Ch. 11, Exercise 12
    public static void contains3Main() {
        ArrayList<String> stringAL = new ArrayList<>();

        stringAL.add("Bob");
        stringAL.add("Bob");
        stringAL.add("Bob");
        stringAL.add("Ann");
        stringAL.add("Jones");
        stringAL.add("Jones");
        stringAL.add("Damien");
        stringAL.add("Damien");

        System.out.println("First array list: " + stringAL);
        System.out.println("Contains 3: " + contains3(stringAL));

        stringAL.clear();

        stringAL.add("Bob");
        stringAL.add("Bob");
        stringAL.add("Ann");
        stringAL.add("Jones");
        stringAL.add("Jones");
        stringAL.add("Damien");
        stringAL.add("Damien");

        System.out.println("Second array list: " + stringAL);
        System.out.println("Contains 3: " + contains3(stringAL));
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


    // 4th Edition Ch. 11, Exercise 13
    public static void isUniqueMain() {
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

        System.out.println(map);
        System.out.println("Map is unique: " + isUnique(map));
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

    // HELPERS
    public static void fillIntList(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
    }

    public static void fillIntSet(Set<Integer> set) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rand.nextInt(10));
        }
    }

}
