import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        LinkedList<String> linkedList = new LinkedList();
        list.add("Bob");
        linkedList.add("Anna");
        printList(linkedList);
        printList(list);

    }

    static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
