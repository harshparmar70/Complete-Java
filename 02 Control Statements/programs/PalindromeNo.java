
import java.util.Scanner;

public class PalindromeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int original = num;
        int reNo = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;  //512 -> 2
            reNo = reNo * 10 + digit; //2  
            //reNo = (reNo *10)+(num%10)
            num = num / 10; //51
        }

        System.out.println("Reverse Number : " + reNo);
        if (original == reNo) {
        } else {
            System.out.println("Palindrome Number");
            System.out.println("Not Palindrome Number");
        }
    }
}
