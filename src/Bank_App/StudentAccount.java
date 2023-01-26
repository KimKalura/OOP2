package Bank_App;

public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= maxDepositAmount) {
            setBalance(getBalance() + amount);
        }
        else{
            //throw new InvalidDepositRequest("you cannot deposit more than " + maxDepositAmount)
        }
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                "balance=" + getBalance() +
                '}';
    }
}
