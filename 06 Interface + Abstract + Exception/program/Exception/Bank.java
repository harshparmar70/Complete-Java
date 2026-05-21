
class InsufficientBalanceException
        extends Exception {

    InsufficientBalanceException(String message) {

        super(message);
    }
}

public class Bank {

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Not enough balance");
        } else {

            System.out.println(
                    "Withdrawal Successful");
        }
    }

    public static void main(String[] args) {

        try {

            withdraw(5000, 7000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}
