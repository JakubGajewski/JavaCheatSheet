public class RuntimeException {
    public static void main(String[] args) {
        int[] tablica = new int[3];

        try {
            System.out.println(tablica[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego czegoś!");
        }

    }
}
