import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        File file = new File("h.txt");
        
        // Write to file
        FileWriter writer = new FileWriter(file);
        writer.write("hello world");
        writer.close();
        
        // Read from file
        FileReader reader = new FileReader(file);
        int ch;
        StringBuilder content = new StringBuilder();
        
        // Read until end of file
        while ((ch = reader.read()) != -1) {
            content.append((char) ch);  // Append each character
        }
        
        // Print file content
        System.out.println(content.toString());
        
        reader.close();
    }
}