package pl.jg;

import java.util.ArrayList;
import java.util.Iterator;

//Scanner implements iterator!

public class Main {

    public static void main(String[] args) {

        ArrayList<String> slimaki = new ArrayList<String>();

        slimaki.add("Teresa");
        slimaki.add("Teryzol");
        slimaki.add("Terespol");

        System.out.println(slimaki);

        Iterator<String> it = slimaki.iterator();

        it.next();
        it.next();
        String slimak2 = it.next();
        System.out.println(slimak2);

        it = slimaki.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        it = slimaki.iterator();

        while (it.hasNext()){
              System.out.println("Slimak " + it.next());

        }


    }
}
