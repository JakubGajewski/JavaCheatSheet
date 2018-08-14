package pl.rolf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class x_niegeneryczne {
    public static void main(String[] args) {
        List zupa = new ArrayList();
        zupa.add("kalafior");
        zupa.add(14);
        zupa.add(new NullPointerException());
        zupa.add(new LinkedList<Integer>());


        for (Object o : zupa) {
            System.out.println(o.getClass() + "---" + o.toString());
        }
    }
}