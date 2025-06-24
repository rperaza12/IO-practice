import java.io.File;
import java.io.IOException;

public class mainFile {

    public static void main(String[] args) throws IOException {
        File myFile = new File("myFile.txt");
        if (myFile.createNewFile()) {
            System.out.println("File Created");
        }else {
            System.out.println("File already exists");
        }
        
    }
}