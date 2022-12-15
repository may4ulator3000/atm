public class AtmWithdraw extends MyAtm {
    private CreditCard creditCard;
    private double amountOfMoney;

    public void insertTheCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    AtmWithdraw() {
        CreditCard creditCard;
    }

    public double withdraw() {
        amountOfMoney = 10;
        return creditCard.withdraw(amountOfMoney);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(getName() + " balance - $ 10 = " + withdraw());
        }
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

}
