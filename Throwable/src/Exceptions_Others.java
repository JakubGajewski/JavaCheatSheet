import java.io.File;
import java.io.IOException;

public class Exceptions_Others {
    public static void main(String[] args) {
        File pliczek = new File("C:\\niematakiegofolderu\\Java.txt");

        try {
            pliczek.createNewFile();
            System.out.println(pliczek + " created!");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
