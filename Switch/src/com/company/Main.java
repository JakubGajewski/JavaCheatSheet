package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jaki jest Twój gatunek?");

        String gatunek = sc.next();

        switch (gatunek) {
            case "Ślimak":
                System.out.println("Kocham ślimaka!");
                break;

            case "Rolf":
                System.out.println("To je jo!");
                break;

            default:
                System.out.println("Jestes " + gatunek + " i tyle");
        }
        ;

    }
}
