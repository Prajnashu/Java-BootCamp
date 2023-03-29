package day3.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
        File file = new File("C:\\Users\\pradehur\\Documents\\Java BootCamp\\day3\\exceptions\\blabberin.txt");
        FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
    }
}
