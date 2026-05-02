import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("+  -  *  /  %");

        char op = sc.next().charAt(0);

        double result;

        switch(op) {
            case '+':
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;

            case '%':
                System.out.println("Result = " + (a % b));
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}