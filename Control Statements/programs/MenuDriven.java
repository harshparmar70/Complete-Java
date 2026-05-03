
import java.util.Scanner;

class MenuDriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 10000;
        int pin = 7071;

        while (true) {
            System.out.println("\nATM Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Set Pin");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter PIN : ");
                    int enteredPin = sc.nextInt();

                    if (enteredPin == pin) {
                        System.out.print("Enter Amount for Withdrawal : ");
                        int w = sc.nextInt();

                        if (w <= 0) {
                            System.out.println("Invalid amount!");
                        } else if (w > money) {
                            System.out.println("Insufficient balance!");
                        } else {
                            money -= w;
                            System.out.println("Withdrawal successful!");
                        }
                    } else {
                        System.out.println("Wrong PIN!");
                    }
                }

                case 2 -> {
                    System.out.print("Enter Amount for Deposit : ");
                    int d = sc.nextInt();

                    if (d <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        money += d;   // 🔥 fixed
                        System.out.println("Deposit successful!");
                    }
                }

                case 3 -> {
                    System.out.print("Enter Previous PIN : ");
                    int prePin = sc.nextInt();

                    if (prePin == pin) {
                        System.out.print("Enter New PIN : ");
                        pin = sc.nextInt();
                        System.out.println("PIN changed successfully!");
                    } else {
                        System.out.println("Invalid PIN!");
                    }
                }

                case 4 -> {
                    System.out.print("Enter PIN : ");
                    int enteredPin = sc.nextInt();

                    if (enteredPin == pin) {
                        System.out.println("Balance : " + money);
                    } else {
                        System.out.println("Wrong PIN!");
                    }
                }

                case 5 -> {
                    System.out.println("Exit...");
                    return;
                }

                default ->
                    System.out.println("Enter valid choice!");
            }
        }
    }
}
