package pl.rolf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class x_hashMap {
    public static void main(String[] args) {
        Map<String, String> visitedCountries = new HashMap<>();

        visitedCountries.put("zupa", "blada");
        visitedCountries.put("zupa", "zbita");
        visitedCountries.put("zupa", "wołowa");
        visitedCountries.put("luj", "zagiety");

        System.out.println(visitedCountries);

        Map<Integer, String> zupa = new HashMap<>();
        zupa.put(1, "one");
        zupa.put(2, "two");
        }
    }

