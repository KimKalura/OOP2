package Bank_App;

//import Bank_App.BankAccount;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        Person person = new Person("Alona","Cohen", accounts);
        BankAccount bankAccount = new SpendingAccount(300,"ROBT3564",2000);
        BankAccount bankAccount1 = new StudentAccount(400,"ROBT578567",3000);
        BankAccount bankAccount2 = new SpendingAccount(5000,"ROBT35478",2000);
        person.addAccount(bankAccount);
        person.addAccount(bankAccount1);
        person.addAccount(bankAccount2);
        person.listAccounts();

        System.out.println(" ");

        System.out.println(bankAccount instanceof SpendingAccount);
        System.out.println(bankAccount instanceof BankAccount);

        System.out.println(" ");

        person.deposit(4000,"ROBT578567");
        System.out.println(bankAccount1.getBalance());
        person.withdraw(2301,"ROBT3564");
        System.out.println(bankAccount.getBalance());

        person.checkAccountDetails("ROBT3564");

    }
}