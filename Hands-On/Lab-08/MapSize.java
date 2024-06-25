package CollectionLab;
import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {
        // Create a HashMap and add key-value pairs to it
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nikhil");
        map.put(2, "Anand");
        map.put(3, "Sakshi");
        map.put(4, "Aakansha");

        // Get the number of key-value mappings in the map
        int size = map.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
