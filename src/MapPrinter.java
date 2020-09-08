import java.util.Map;


public class MapPrinter<K, V> {

    public static void main(String[] args) {
        new MapPrinter();
    }

  public MapPrinter() {

  }

    public void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
