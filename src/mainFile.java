import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainFile {

    public static void main(String[] args) throws IOException {
        try {

        File myFile = new File("myFile.txt");

        //Creates the file if it doesnt exist
        if (myFile.createNewFile()) {
            System.out.println("File Created");
        }else {
            System.out.println("File already exists");
        }

        //We add some data into the file
        FileWriter writer = new FileWriter(myFile);
        writer.write("This is just to test.\nAnother line goes here as well");
        writer.close();

        //Reads the file content
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        } reader.close();
            
        } catch (IOException e) {
            System.out.println("An Error ocurred");
            e.printStackTrace();
        }
    }
}