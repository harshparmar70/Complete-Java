
class WrapperDemo {

    public static void main(String[] args) {
        //boxing
        int a = 10;
        // Integer obj = Integer.valueOf(a);
        Integer obj = a; //autoboxing
        System.out.println(obj);

        //unboxing
        Integer obj1 = 50;
        // int b = obj1.intValue();
        int b = obj1; //auto unboxing
        System.out.println(b);

        String s = "100";
        int c = Integer.parseInt(s);
        System.out.println(c);

        Integer d = 10;
        int i = d.intValue();
        System.out.println(i);
        String str = d.toString();
        System.out.println(str);
    }
}
