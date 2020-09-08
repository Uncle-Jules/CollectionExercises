import java.util.Map;
import java.util.TreeMap;

public class AnvendMapPrinter {

    public static void main(String[] args) {
        MapPrinter mapPrinter = new MapPrinter();

        Map<String, Double> movieMap = new TreeMap<>();
        movieMap.put("Matrix", 5.2);
        movieMap.put("Braveheart", 3.3);
        movieMap.put("Big Lebowsky", 2.6);
        movieMap.put("LOTR", 7.4);
        movieMap.put("Star Wars", 1.2);
        movieMap.put("Up", 6.5);
        mapPrinter.printMap(movieMap);
    }
}
