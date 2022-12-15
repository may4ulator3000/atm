public class AtmDeposit extends MyAtm {
    private CreditCard creditCard;

    public void insertTheCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    AtmDeposit() {
        CreditCard creditCard;
    }

    public double deposit() {
        depositMoney = 6;
        return creditCard.deposit(depositMoney);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            creditCard.deposit(5);
            System.out.println(getName() + " balance + $6 = " + deposit());
        }
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
