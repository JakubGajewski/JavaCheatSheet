package pl.jg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StringBuilder Wojciech = new StringBuilder("hejże ho! ");
        System.out.println(Wojciech);

        Wojciech.reverse();
        System.out.println(Wojciech);
        Wojciech.reverse();

        String[] dzieci = {"Kasia", "Basia", "Asia"};
        Wojciech.append(Arrays.toString(dzieci)
                .trim()
                .replace("[","")
                .replace("]","")
                .replace(", ",""));
        System.out.println(Wojciech);


        System.out.println(Wojciech.reverse());

        System.out.println(Wojciech.charAt(0));

        String WojStr = Wojciech.toString();

        System.out.println(WojStr.split("a"));





    }
}
