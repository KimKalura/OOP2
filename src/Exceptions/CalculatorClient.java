package Exceptions;

public class CalculatorClient {
    public static void main(String[] args) {

       /* try {
            int division = 8 / 2;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero." + e.getMessage());
            //orice clasa de exceptie mai are si un atribut:e.getMessage()
            //e-ul  este obiectul de exceptie care vine in catch
            //orice exceptie are ca atribut un mesaj care vine ca geter
        }*/

        try {
            System.out.println(Calculator.divide(8, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}