public class CreditCard {
    private double balance = 500;

    public double deposit(double depositMoney) {
        balance += depositMoney;
        return balance;
    }

    public double withdraw(double amountOfMoney) {
        balance = balance - amountOfMoney;

        return balance;
    }

    public double getBalance() {
        return balance;
    }
}


