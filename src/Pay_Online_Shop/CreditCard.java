package Pay_Online_Shop;

public class CreditCard extends Card implements Payable {
    private final double maxOverDraft;


    public CreditCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, double maxOverDraft) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }

    public double getMaxOverDraft() {
        return maxOverDraft;
    }

    public void pay(double amount) {
        if (amount < maxOverDraft + getCardBalance()) {
            setCardBalance(getCardBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + this.getCardNumber() +
                "maxOverDraft=" + maxOverDraft +
                '}';
    }
}
