package pl.rolf;
public class Main {


    public static void main(String[] args) {
        String shepherd = "Burek";
        String dog = "Reksio";
        String pudel = "BureK";
        String collie = "Kaja";

        if (shepherd.equals(pudel)){
            System.out.println("Nazwy się powtarzają!!!");
        }
        if (shepherd.equalsIgnoreCase(pudel)){
            System.out.println("Nazwy brzmią tak samo, choć niby są inne!!!");
        }

        if (collie.endsWith("a")){
            System.out.println(collie + " to suczka!");
        };

        System.out.println(shepherd.compareTo(dog));
    }
}
