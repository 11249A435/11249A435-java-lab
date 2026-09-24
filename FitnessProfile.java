import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessProfile {
    public static void main(String[] args) {

        String fileName = "profile.txt";

        String profileData =
                "Name: Rahul\n" +
                "Age: 22\n" +
                "Weight: 65 kg\n" +
                "Daily Steps: 8000\n";

        // Writing data to the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] data = profileData.getBytes();
            fos.write(data);

            System.out.println("Profile data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading data from the file
        try (FileInputStream fis = new FileInputStream(fileName)) {

            int ch;

            System.out.println("\nUser Profile:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}