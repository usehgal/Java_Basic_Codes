import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            String content = "Hello, this is some text to write to a file.";
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("File write successful!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
