
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); //16+length();
        sb.append(" Programming");
        System.out.println(sb);
        sb.insert(4, " Language");
        System.out.println(sb);
        sb.replace(0, 4, "Python");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
