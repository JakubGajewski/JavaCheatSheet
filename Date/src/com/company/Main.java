package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date Andrzej = sdf.parse("15021990");
        System.out.println(Andrzej);
    }
}
