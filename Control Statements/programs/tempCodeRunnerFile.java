
import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flg = 0;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flg = 1;
                break;
            }
        }
        if (flg == 1) {
            System.out.println(n + " is not Prime Number");
        } else {
            System.out.println(n + " is Prime Number");
        }
    }
}
