
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.size());

        list.set(0, "Java Programming");
        System.out.println(list);

    }
}
