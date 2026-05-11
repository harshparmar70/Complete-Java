
interface Payment {

    void pay(double amount);
}

// UPI Payment
class UPI implements Payment {

    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Credit Card Payment
class CreditCard implements Payment {

    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

// Net Banking Payment
class NetBanking implements Payment {

    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(5000);

        p = new CreditCard();
        p.pay(10000);

        p = new NetBanking();
        p.pay(7000);
    }
}
