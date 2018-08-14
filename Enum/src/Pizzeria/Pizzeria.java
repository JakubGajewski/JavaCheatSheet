package Pizzeria;

/*
        Typ wyliczeniowy enum - Zadanie

        Napisz prostą aplikację, która będzie symulowała pizzerię. Stwórz dwie klasy:

        Z definicją typu enum o nazwie Pizza, który może przyjmować wartość MARGHERITA (sos pomidorowy + ser), CAPRICIOSA (sos pomidorowy + ser + pieczarki) lub PROSCIUTTO (sos pomidorowy + ser + szynka).
        Typ Pizza powinien przechowywać informacje o każdym składniku osobno, pozwalać odczytać informację o każdym składniku, a także przesłania metodę toString()
        Klasę Pizzeria, w której wyświetlisz użytkownikowi możliwe do wyboru pizze, wczytasz od niego tę pizzę, którą chce, a na końcu potwierdzisz zamówienie.

        Wykorzystaj w programie jak najwięcej funkcjonalności jakie daje wykorzystanie typu enum.*/


import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Pizza newOrderedPizza;

        System.out.println("Witamy w naszej pizzerii!!!");
        System.out.println("Możliwe pizze do wyboru:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p.name() + " " + p.toString());
        }
        System.out.print("Wpisz nazwę pizzy: ");
        Scanner sc = new Scanner (System.in);
        String orderedPizza  = sc.nextLine();

        switch (orderedPizza){
            case "MARGHERITA": {
                newOrderedPizza = Pizza.MARGHERITA;
                System.out.println("Wybrano margeritę!");
                break;
            }
            case "CAPRICIOSA": {
                newOrderedPizza = Pizza.CAPRICIOSA;
                System.out.println("Wybrano capruicośtam!");
                break;
            }

            case "PROSCIUTTO": {
                newOrderedPizza = Pizza.PROSCIUTTO;
                System.out.println("Wybrano prosciutto!");
                break;
            }
            default: {
                System.out.println("Ni ma takiej pizzy!!!");
            }
        }

    }


}

