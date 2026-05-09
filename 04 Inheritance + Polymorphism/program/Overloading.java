
class Print {

    void display(int a) {
        System.out.println(a);
    }

    void display(String s) {
        System.out.println(s);
    }
}

public class Overloading {

    public static void main(String[] args) {

        Print p = new Print();

        p.display(10);
        p.display("Java");
    }
}
/* 
Compiler checks:

Method name
Parameters

This process is called:

Static Binding / Compile-Time Binding
*/
