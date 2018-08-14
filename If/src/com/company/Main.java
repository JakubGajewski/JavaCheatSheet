package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("Nie pijesz alkoholu");
        } else if (age > 15 && age < 18) {
            System.out.println("Pijesz tylko piwo");
        } else {
            System.out.println("Pij co chcesz");
        }

        String wejscie = age >= 22 ? "Możesz wejść na imprezę" : "Nie wejdziesz.";
        System.out.println(wejscie);

    }
}
