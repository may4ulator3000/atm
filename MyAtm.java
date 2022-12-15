import static java.lang.Math.*;

public class MyAtm extends Thread {
    CreditCard creditCard;
    double depositMoney;

    public void insertTheCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    MyAtm() {
        CreditCard creditCard;
        try {
            Thread.sleep((long) (random() * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleep(long v) {
    }

    public double deposit() {
        depositMoney = 5;
        return creditCard.deposit(depositMoney);
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(getName() + " balance + $5 = " + deposit());
        }
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}



