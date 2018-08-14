package pl.rolf;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        char a = 15010;
        char b = 'a';
        char c = '3';
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        String cc = String.valueOf(c);
        System.out.println(a + " " + b + " " + c);
        System.out.println(a + b + c);
        System.out.println("_____");
        System.out.println(a + b);
        System.out.println(b + c);
        System.out.println(a + c);
        System.out.println("_____");
        System.out.println(aa + " " + bb + " " + cc);
        System.out.println(aa + bb + cc);
    }
}
