
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistStd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter marks (Enter -1 to stop):");

        while (true) {
            int input = sc.nextInt();

            // Check if the user wants to stop
            if (input == -1) {
                break;
            }
            marks.add(input);
        }
        System.out.println("Final marks list: " + marks);

        System.out.println("Displaying marks:");
        for (int m : marks) {
            System.out.println("Mark: " + m);
        }
    }
}
