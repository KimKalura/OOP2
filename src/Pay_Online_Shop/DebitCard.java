package Pay_Online_Shop;

public class DebitCard extends Card implements Payable {
    private double maxTransactionAmount;

    public DebitCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, double maxTransactionAmount) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public double getMaxTransactionAmount() {
        return maxTransactionAmount;
    }



    public void pay(double amount) {
        if (amount < maxTransactionAmount && amount < getCardBalance()) {
            setCardBalance(getCardBalance() - amount);
        }
    }

    public void changeTransactionLimit(double amount) { //`va da o noua valoare atributului maxTransactionAmount`
       this.maxTransactionAmount = amount;
    }


    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + this.getCardNumber() +
                "maxTransactionAmount=" + maxTransactionAmount +
                '}';
    }
}

