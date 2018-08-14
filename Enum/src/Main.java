import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SimpleEnum pierwszy;
        pierwszy = SimpleEnum.D;

        System.out.println(pierwszy);
        for (SimpleEnum se : SimpleEnum.values()) {
            System.out.println(se);
        }

        System.out.println(pierwszy);
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
    }
}
