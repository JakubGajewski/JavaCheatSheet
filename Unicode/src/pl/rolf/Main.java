package pl.rolf;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        char n = '\u0000';

       do {n = ++n;
       System.out.println(n);
        } while (n != '\uFFFF');
    }
}

