package Bank_App;

public class Person {
    private String firstName;
    private String lastName;
    private BankAccount[] accountList;
    private int numberOfAccounts;

    public Person(String firstName, String lastName, BankAccount[] accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList(BankAccount[] accountList) {
        this.accountList = accountList;
    }

    public void addAccount(BankAccount account) {
        accountList[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    public void listAccounts() {
        for (int i = 0; i < accountList.length; i++) {
            System.out.println("Account Number: " + accountList[i].getAccountNumber() + ", sold: " + accountList[i].getBalance());
            if (accountList[i] instanceof StudentAccount) {
                System.out.println("Account type is: StudentAccount");
            } else {
                System.out.println("Account type is: SpendingAccount");
            }
        }
    }

    public void deposit(double amount, String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                accountList[i].deposit(amount);
            }
        }
    }

    public void withdraw(double amount, String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);
        accountList[withdrawalAccountPosition].withdraw(amount);
    }

    private int search(String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                return i;
            }
        }
        return -1;
    }
    public void checkAccountDetails(String accountNumber) {
       int accountPosition = search(accountNumber);
       System.out.println(accountList[accountPosition].toString());

    }

}
