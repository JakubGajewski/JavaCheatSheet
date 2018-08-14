package pl.rolf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pl.rolf.Snail aSnail = new pl.rolf.Snail();

        System.out.println("What is Snail name?");
        aSnail.setName(sc.nextLine());

        System.out.println("Who is " + aSnail.getName() + " owner?");
        aSnail.setOwnerName(sc.nextLine());

        System.out.println("Whend did " + aSnail.getName() + " born?");
        SimpleDateFormat form = new SimpleDateFormat("yyyy.MM.dd");
        do {
            String input = getUserInput();
            try {
                aSnail.setBirthday(form.parse(input));
            } catch (ParseException pe) {
                try {
                    aSnail.setBirthday(form.parse(input.replace('-','.')));
                    ///To bez sensu, robię tak testowo!!!
                } catch (ParseException pe2) {
                    System.out.println("Hey dude, PLEASE type date in format \"YYYY.MMMM.DD\"");
                }
            }
        } while (aSnail.getBirthday() == null);

        System.out.println("How many pounds does " + aSnail.getName() + " weight?");
        do {
            try {
                aSnail.setWeight(Float.valueOf(getUserInput()));
            } catch (NumberFormatException nfe) {
                System.out.println("Please type a number!");
            }
        } while (aSnail.getWeight() == null);

        System.out.println(aSnail.whatIsYourName());
    }

    public static String getUserInput() {
        return sc.nextLine().trim();
    }

}
