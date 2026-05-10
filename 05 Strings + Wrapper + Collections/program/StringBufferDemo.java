
public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
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
