package pl.rolf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.AbstractMap.*;
import java.util.Map;


public class X_map {
    private static final java.util.Map<Integer, String> myMap = Stream.of(
            new SimpleEntry<>(1, "one"),
            new SimpleEntry<>(2, "two"),
            new SimpleEntry<>(3, "three"),
            new SimpleEntry<>(4, "four"),
            new SimpleEntry<>(5, "five"),
            new SimpleEntry<>(6, "six"),
            new SimpleEntry<>(7, "seven"),
            new SimpleEntry<>(8, "eight"),
            new SimpleEntry<>(9, "nine"),
            new SimpleEntry<>(10, "ten"))
            .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));


    Map<Integer, String> myMap2 = new HashMap<Integer, String>(){{
            put(1, "one");
            put(2, "two");
        }};
    //Please, never use double brace initialization - it's a hack, and an easy way to leak memory and cause other problems.
    //https://stackoverflow.com/questions/924285/efficiency-of-java-double-brace-initialization
}

