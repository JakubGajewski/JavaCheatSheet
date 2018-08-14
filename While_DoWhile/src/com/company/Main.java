package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Odliczamy od...");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count > 0){
            System.out.println(count);
            count --;
            int mini = count;

            do {
                System.out.println(mini);
                mini--;
            }
            while(mini>0);
        }
        }


    }
