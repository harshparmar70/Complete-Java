
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Harsh");
        map.put(102, "Raj");
        map.put(103, "Amit");
        System.out.println(map);

        System.out.println(map.get(101));

        map.remove(102);
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey(103));
    }
}
