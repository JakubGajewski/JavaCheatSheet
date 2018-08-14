import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Adam", "Wojtek", "Błażej");

        nameList.forEach(name -> System.out.println("Hello, my name is " + name));
    }
}
