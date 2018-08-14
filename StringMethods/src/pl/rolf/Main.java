package pl.rolf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String A = "   _ Bardzo ciekawy string... _   ";
        System.out.println("You can make strings lower case:\n" + A.toLowerCase()
                + "\nupper case\n" + A.toUpperCase() + "\nYou can ask for it's length:\n" +A.length()
                +"\nTry some concatenation...\n"+A.concat(A)+"\n...or try to trim it:\n" + A.trim()
                +"\nAnd if your'e curious about what's hiding at some index, just type that index:\n");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Character at index " + index + " is " + A.charAt(index));
    }
}
