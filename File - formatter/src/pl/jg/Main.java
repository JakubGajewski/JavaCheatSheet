package pl.jg;

        import java.io.FileNotFoundException;
        import java.util.Formatter;
        import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Type file name: ");
        String fileName = sc.next();
        System.out.println("Type content: ");
        String fileContent = sc.next();

        try {
            Formatter f = new Formatter("C:\\filesByMyProgram\\" + fileName +".txt");
            f.format("%s",fileContent);
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error - wrong file name");
        }




    }
}
