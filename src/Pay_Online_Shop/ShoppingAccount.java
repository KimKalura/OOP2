package Pay_Online_Shop;

import java.util.Arrays;

public class ShoppingAccount {
    private Card[] cardList;
    private Address[] addressList;
    private String firstName;
    private String lastName;
    private String currentPaymentMethod;
    private String currentBillingAddress;

    int noOfAddressAdded;
    int numberOfAddedCards;

    public ShoppingAccount(Card[] cardList, Address[] addressList, String firstName, String lastName,
                           String currentPaymentMethod, String currentBillingAddress) {
        this.cardList = cardList;
        this.addressList = addressList;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentPaymentMethod = currentPaymentMethod;
        this.currentBillingAddress = currentBillingAddress;
    }

    public Card[] getCardList() {
        return cardList;
    }

    public void setCardList(Card[] cardList) {
        this.cardList = cardList;
    }

    public Address[] getAddressList() {
        return addressList;
    }

    public void setAddressList(Address[] addressList) {
        this.addressList = addressList;
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

    public String getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(String currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public String getCurrentBillingAddress() {
        return currentBillingAddress;
    }

    public void setCurrentBillingAddress(String currentBillingAddress) {
        this.currentBillingAddress = currentBillingAddress;
    }



    public void addPaymentMethod(Card card) {
        cardList[numberOfAddedCards] = card;
        numberOfAddedCards++;
    }

    public void addAddress(Address address) {
        addressList[noOfAddressAdded] = address;
        noOfAddressAdded++;
    }

    public boolean removePaymentMethod(String cardNumber) {
        int cardIndex = getCardIndex(cardNumber);
        if (cardIndex == -1) {
            return false;
        }
        for (int i = cardIndex; i < numberOfAddedCards-1; i++) {
            cardList[i] = cardList[i + 1];
        }

        cardList[numberOfAddedCards-1] = null;
        numberOfAddedCards--;
        return true;
    }

    private int getCardIndex(String cardNumber) {
        for (int i = 0; i < numberOfAddedCards; i++) {
            if (cardList[i].getCardNumber().equals(cardNumber)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAdress(String street) {
        int streetIndex = getStreetIndex(street);
        if (streetIndex == -1) {
            return false;
        }
        for (int i = streetIndex; i < addressList.length-1; i++) {
            addressList[i] = addressList[i + 1];
        }

        addressList[noOfAddressAdded-1] = null;
        noOfAddressAdded--;
        return true;
    }

    private int getStreetIndex(String street) {
        for (int i = 0; i < noOfAddressAdded; i++) {  //.length??
            if (addressList[i].equals(street)) {
                return i;
            }
        }
        return -1;
    }

    public void selectPaymentMethod(String cardNumber) {
//        this.currentPaymentMethod = cardNumber;
        setCurrentPaymentMethod(cardNumber);
    }

    public void selectAddress(String street) {
        //this.currentBillingAddress = street;
        setCurrentBillingAddress(street);
    }

    public void generateInvoice(int amount, Card card, Address address) {
        System.out.println("Name: " + getFirstName() + " " + getLastName() + ". " + "You paid the amount of " + amount + ". " + "Card number: " + card.getCardNumber() + ", adress: " + address + ".");
    }

    public void printAllCards() {
        for (int i = 0; i < cardList.length; i++) {
            System.out.println(cardList[i]);

        }
    }
    public void printAllAddresses() {
        for (int i = 0; i < addressList.length; i++) {
            System.out.println(addressList[i]);

        }
    }

    @Override
    public String toString() {
        return "ShoppingAccount{" +
                "cardList=" + Arrays.toString(cardList) +
                ", addressList=" + Arrays.toString(addressList) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", currentPaymentMethod='" + currentPaymentMethod + '\'' +
                ", currentBillingAddress='" + currentBillingAddress + '\'' +
                ", noOfAddressAdded=" + noOfAddressAdded +
                ", numberOfAddedCards=" + numberOfAddedCards +
                '}';
    }
}