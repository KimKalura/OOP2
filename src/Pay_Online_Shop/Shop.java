package Pay_Online_Shop;

import Library_Management_System.Book;

import java.util.concurrent.CopyOnWriteArrayList;

public class Shop {
    public static void main(String[] args) {
        Card card = new Card(true, "4156", "111222333", "Itay Levy", 9000);
        card.changePin("321r");
        System.out.println(card.getPIN());
        card.freezeCard();
        System.out.println(card.isActive());

        System.out.println(" ");

        DebitCard debitCard = new DebitCard(true, "8525", "444555666", "Sadie Aram", 800, 1000);
        debitCard.pay(350);
        System.out.println(debitCard.getMaxTransactionAmount());
        System.out.println(debitCard.getCardBalance());  //cardBalance - amount
        debitCard.changeTransactionLimit(5000);
        System.out.println(debitCard.getMaxTransactionAmount());

        System.out.println(" ");

        CreditCard creditCard = new CreditCard(true, "3695", "777888999", "Moon HeeJun", 950, 1500);
        creditCard.pay(360);
        System.out.println(creditCard.getMaxOverDraft());
        System.out.println(creditCard.getCardBalance()); // cardBalance - amount

        System.out.println(" ");

        Address[] addressList = new Address[2];
        Address address = new Address("Sunflower", 3, "Cluj");
        Address address1 = new Address("Zorilor", 5, "Sibiu");
       // Book[] addressList = {address, address1};
        Card[] cardList = new Card[2];

        ShoppingAccount shoppingAccount = new ShoppingAccount(cardList, addressList, "Taemin", "Kim", "debitCard", "Sunflower");
        shoppingAccount.generateInvoice(325, debitCard, address);

        shoppingAccount.addPaymentMethod(debitCard);
        shoppingAccount.addPaymentMethod(creditCard);
        System.out.println(shoppingAccount.numberOfAddedCards);

        System.out.println("address added");
        shoppingAccount.addAddress(address);
        System.out.println(shoppingAccount.noOfAddressAdded);

        System.out.println("----");
        System.out.println("all cards");
        shoppingAccount.printAllCards();
        System.out.println("removing card");
        shoppingAccount.removePaymentMethod("444555666");
        shoppingAccount.printAllCards();

        System.out.println("----");
        System.out.println("all addresses");
        shoppingAccount.printAllAddresses();
        System.out.println("removing address");
        shoppingAccount.removeAdress("Zorilor");
        shoppingAccount.printAllAddresses();

        System.out.println("----");
        shoppingAccount.selectPaymentMethod("444555666");
        System.out.println(shoppingAccount.getCurrentPaymentMethod());
        shoppingAccount.selectAddress("Cicada");
        System.out.println(shoppingAccount.getCurrentBillingAddress());
    }
}
