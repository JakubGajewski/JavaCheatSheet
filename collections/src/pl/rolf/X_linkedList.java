package pl.rolf;

import java.util.LinkedList;
import java.util.List;

public class X_linkedList {

    public static void main(String[] args) {

        Integer y2015 = 7200;
        Integer y2016 = 10800;
        Integer y2017 = 13000;


        List<Integer> kilometrageList = new LinkedList<>();
        kilometrageList.add(y2015);
        kilometrageList.add(y2016);
        kilometrageList.add(y2017);

        System.out.println(kilometrageList.get(0));

        System.out.println(kilometrageList);

    }

}
