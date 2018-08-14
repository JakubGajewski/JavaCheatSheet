package pl.jg;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        do {
            System.out.println("Ile masz lat?");
            String mozeszPic = (sc.nextInt() > 17) ? "Możesz pić!" : "Nie pijesz!";
            System.out.println(mozeszPic);
        } while (0==0);
    }
}
