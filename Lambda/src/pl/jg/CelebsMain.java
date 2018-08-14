package pl.jg;

        import java.util.ArrayList;
        import java.util.List;

public class CelebsMain {
    public static void main(String[] args) {
        List<Celebrity> celebrities = new ArrayList<Celebrity>();
        celebrities.add(new Celebrity("Justin Bieber", true, false, true));
        celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
        celebrities.add(new Celebrity("Joanna Krupa", true, true, false));

        print(celebrities, new CheckIfSinger());//przekazujemy klasę, która sprawdza
    }

    private static void print(List<Celebrity> celebrities, CheckTalent checker) {
        for (Celebrity celebrity : celebrities) {
            if (checker.test(celebrity)) {
                System.out.println(celebrity + " ");
            }
            System.out.println();
        }
    }
}