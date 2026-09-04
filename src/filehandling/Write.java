package filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args){

        // How to write a file using JAVA (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\ayan\\Desktop\\test.txt";
        String textContent = "I like pizza!\nIt's really good!\nBuy me pizza!]\nBOOTY BOOTY BOOTY!";

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
