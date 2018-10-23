package com.company;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rosol rosol = new Rosol();
        List<Field> fieldList = Arrays.asList(rosol.getClass().getDeclaredFields());
        fieldList.forEach(s-> System.out.println(s));



    }

    public static class StaticClass {
        int value = 49;
        static int valueStatic = 50;

        public void logTheValues() {
            System.out.println(value + "  " + valueStatic);
        }
    }
}


