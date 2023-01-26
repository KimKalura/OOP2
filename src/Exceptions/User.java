package Exceptions;

public class User {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws InvalidEmailException {
        //InvalidEmailException emailException = new InvalidEmailException("raluca.deftu");

        if(!emailAddress.contains("@")) {
            throw new InvalidEmailException("Your email is not valid");
            //sau throw emailException;
        }
        this.emailAddress = emailAddress;
    }
}
