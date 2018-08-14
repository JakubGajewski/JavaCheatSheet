package Psiarnia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal niewiadomoco = new Animal();
        Animal reksio = new Dog();

        reksio.getSound();
        ((Dog)niewiadomoco).getSound();
    }
}
