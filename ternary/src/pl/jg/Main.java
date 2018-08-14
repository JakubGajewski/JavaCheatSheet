package pl.jg;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Podaj imię dla Rolfa");
            String name = sc.next();
            String answer = (name.equalsIgnoreCase("Rolf") | name.equalsIgnoreCase("Tajga") | name.equalsIgnoreCase("Opiekun") | name.equalsIgnoreCase("Ślimaka") ? "To jest dobre imię dla Rolfa" : "To nie jest dobre imię dla Rolfa");
            System.out.println(answer);
        } while (1 == 1);
    }
}
