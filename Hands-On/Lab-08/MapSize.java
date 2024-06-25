package CollectionLab;
import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {
        // Create a HashMap and add key-value pairs to it
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aniket");
        map.put(2, "Bodhe");
        map.put(3, "Andy");
        map.put(4, "B");

        // Get the number of key-value mappings in the map
        int size = map.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
