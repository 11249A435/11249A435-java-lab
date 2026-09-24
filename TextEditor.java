import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {

        String fileName = "document.txt";

        // Writing content
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Welcome to Java File Handling.\n");
            writer.write("This is a text editor example.\n");
            writer.write("FileWriter is used to write characters.");

            System.out.println("Content written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading content
        try (FileReader reader = new FileReader(fileName)) {

            int ch;

            System.out.println("\nFile Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}