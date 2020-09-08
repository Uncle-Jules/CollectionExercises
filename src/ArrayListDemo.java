import java.util.ArrayList;

// 4th Edition Ch. 10, Exercise 1
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intAL = new ArrayList<>();

        int num1 = 10;
        int num2 = 4;
        int num3 = 2;
        int num4 = 7;
        int num5 = 8;
        int num6 = 2;

        intAL.add(num1);
        intAL.add(num2);
        intAL.add(num3);
        intAL.add(num4);
        intAL.add(num5);
        intAL.add(num6);

        removeFirst(intAL);
        printLength(intAL);
        System.out.println(intAL);

        cloneAL(intAL);
    }

    public static void addToAL(ArrayList intAL) {
        for (int i = 1; i < 7; i++) {
            //intAL.add()
        }
    }

    public static void printLength(ArrayList intAL) {
        System.out.println(intAL.size());
    }

    public static void removeFirst(ArrayList intAL) {
        intAL.remove(0);
    }

    public static Object cloneAL(ArrayList intAL) {
       return intAL.clone();
    }

}
