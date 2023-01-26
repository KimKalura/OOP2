import java.util.Arrays;
import java.util.List;

public class Recap {

    public static void main(String[] args) {

        //Scrie o functie care numara cate numere divizibile cu 7 se afla in intervalul x,y si returneaza valoarea
     /* int numbersCounted = countDivisionBy(2, 2, 8);
        System.out.println(numbersCounted);*/

        //Scrie o functie care numara cate cuvinte palindrom se afla intr-o lista
      /*  System.out.println("ana");
        List<String> words = Arrays.asList("Ana", "ana", "raluca");
        System.out.println(countPalindromes(words));*/

        printRectangle(4, 3);

    }

    public static int countDivisionBy(int divideBy, int minInterval, int maxInterval) {
        int numbersCount = 0;
        for (int i = minInterval; i <= maxInterval; i++) {
            if (i % divideBy == 0) {
                numbersCount++;
            }
        }
        return numbersCount;
    }

    public static int countPalindromes(List<String> words) {
        int wordCounter = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                wordCounter++;
            }
        }
        return wordCounter;
    }

    public static boolean isPalindrome(String word) {
        //boolean isPalindrome = false;
        String backword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            backword += word.charAt(i);
        }
        if (word.equalsIgnoreCase(backword)) {
            //isPalindrome = true;
            return true;
        }

        return false;
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
