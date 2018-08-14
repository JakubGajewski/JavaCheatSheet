package pl.jg;

public class Main {

    public static void main(String[] args) {
        rekursja(0);
    }
    static int rekursja (int i) {
        if (i<100) {
            System.out.println(rekursja(i + 1));
        }
        return i;
    }
}


//inaczej rekursja - funkcja, która wywołuje samą siebie