//Fizz Buzz od 0 do zadanej liczby///

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Błażej = new Scanner(System.in);
        System.out.println("Do ilu liczymy?");
        int x = Błażej.nextInt();
        int n = 0;
        for(n=1; n<=x; n++){
            if (n%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (n%5 == 0){
                System.out.println("Buzz");
            }
            else if (n%3 == 0){
                System.out.println("Fizz");
            }
            else
                System.out.println(n);
        }



    }
}
