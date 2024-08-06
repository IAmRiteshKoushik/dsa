import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * NewHashMap
 */
public class NewHashMap {

    public static void main(String[] args) {
        
        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 89);
        map.put("Ritesh", 79);
        map.put("Kiran", 100);

        System.out.println(map.get("Kiran"));
        System.out.println(map.getOrDefault("Sitesh", 1));

        // HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(28);
        set.add(29);
        set.add(10);
        set.add(12);

        System.out.println(set);

        // TreeMap
        TreeMap<String, Integer> mapT = new TreeMap<>();
        mapT.put("Caddy", 10);
        mapT.put("House", 68);
        mapT.put("Max", 29);
        System.out.println(mapT);
    }
}
