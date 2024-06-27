
import java.io.*;

public class CopyAFile 
{
    public static void main(String[] args) 
    {
        String inputFile = "C:/Users/hp/Desktop/file.txt/";
        String outputFile = "C:/Users/hp/Desktop/file_copy.txt/";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) 
        {
        	String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.write(System.lineSeparator());
            }

            System.out.println("File is copied successfully.");

        } 
        
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
}
