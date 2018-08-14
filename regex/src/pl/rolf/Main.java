package pl.rolf;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many pounds does it weight?");
        Scanner sc = new Scanner(System.in);
        String goodWeight = "";
        Pattern weightPattern = Pattern.compile("[0-9]+\\.[0-9]+|[0-9]+");
        while (goodWeight.equals("")) {
            String weightInput = sc.nextLine();
            Matcher weightMatcher = weightPattern.matcher(weightInput);
            if (weightMatcher.matches()) {
                goodWeight = weightInput;
            } else {
                System.out.println("Try again! Type either iteger or floating-point number.");
            }
        }
        System.out.println("It weights " + goodWeight);

    }
}
