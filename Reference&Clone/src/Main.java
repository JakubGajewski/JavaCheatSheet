public class Main {

    public static void main(String[] args) {

        Dog owczarek = new Dog("burek", "pink");
        Dog husky = owczarek;

        husky.setName("Alojzy");

        owczarek.printAbout();
        // write your code here

        StringBuilder rower = new StringBuilder ("Accent");
        StringBuilder rowerek = rower;
        rowerek.append("!");
        System.out.println(rower);

        //Mutable chyba tak mają...

        Dog pinczer = new Dog("Wojtek", "grey");
        Dog sznaucer = new Dog();
        try {
            sznaucer = (Dog) pinczer.clone(); //dziwna niedzxiałająca metoda
        } catch (CloneNotSupportedException c) {}

        sznaucer.setName("Kazbek");
        System.out.println(pinczer.toString());
        System.out.println(sznaucer.toString());
    }
}
