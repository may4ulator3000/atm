public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();

        MyAtm myAtm = new MyAtm();
        AtmDeposit atmDeposit = new AtmDeposit();
        AtmWithdraw atmWithdraw = new AtmWithdraw();

        myAtm.insertTheCard(creditCard);
        atmDeposit.insertTheCard(creditCard);
        atmWithdraw.insertTheCard(creditCard);

        myAtm.start();
        atmDeposit.start();
        atmWithdraw.start();
    }
}