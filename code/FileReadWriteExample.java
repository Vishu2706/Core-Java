import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Read from the source file and write to the destination file
        try (FileReader fr = new FileReader(sourceFilePath);
             FileWriter fw = new FileWriter(destinationFilePath)) {

            int data;
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }

            System.out.println("File content copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}