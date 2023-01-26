package Exceptions;

public class Calculator {

    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException {
        //ArithmeticException arithmeticException = new ArithmeticException();

        if (secondNumber == 0) {
            throw new ArithmeticException("You cannot divide by 0");
            //si ar fi fost:  throw arithmeticException
        }
        int division = firstNumber / secondNumber;
        return division;
    }

}

