package Exceptions;

public class OnlineShop {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.setEmailAddress("raluca.deftu");
        }catch (InvalidEmailException emailException) {
            System.out.println(emailException.getMessage());
        }
    }
}
