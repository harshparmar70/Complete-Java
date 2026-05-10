
public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        //Immutable
        String s = "Java";
        // s.concat(" Programming");
        s = s.concat(" Programming");
        System.out.println(s);

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s1.concat(s2));

    }
}
