package ExceptionalHandling;
import java.io.FileReader;
import java.io.IOException;

public class Exception1{
    public static void main(String[] args) {
        try {
            // FileReader throws checked exception if file not found
            FileReader fr = new FileReader("Vikul.txt");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

