import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordsCount {
    

    public static void main(String[] args) throws IOException {
        //Create the path
        File wordsFile = new File("words.txt");

        //The new words file is created
        if (wordsFile.createNewFile()) {
            System.out.println("New file has been created");
        } else{
            System.out.println("The file already exist");
        }

        // Write on the file 
        FileWriter writer = new FileWriter(wordsFile);
        writer.write("This is the first practice on my own.\nSo the words will be counted");
        writer.close();

        //Read the file and counts the words
        BufferedReader reader = new BufferedReader(new FileReader(wordsFile));
        String line;
        int totalcount = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            int counter = line.split("\\s").length;
            totalcount +=  counter;

        }
        System.out.println("Total words: " + totalcount);
        reader.close();
    }
}
