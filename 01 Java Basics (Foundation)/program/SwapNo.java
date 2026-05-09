class SwapNo{
    public static void main(String args[]){

       
        int a = 10 ,b = 20;
        System.out.println("a = "+a);
        System.out.println("b = "+b+"\n");

        //Logic 1
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);

        //Logic 2
        a = a+b; //30   a = a * b;
        b = a-b; //10   b = a / b;
        a = a-b; //20   a = a / b;
        System.out.println(a + " " + b);
        
        //Logic 3
        a = a ^ b;  //a = 10^20 =01010^10100=11110=30
        b = a ^ b;  //b = 30^20 =11110^10100=01010=10
        a = a ^ b;  //a = 10^30 =01010^11110=10100=20
        System.out.println(a + " " + b);

    }
}
