package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {
    public static void main(String[] args) {
        File file = new File("src/Exceptions/sensor_data.csv");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            System.out.println("This code always executes");

        }
    }
}
