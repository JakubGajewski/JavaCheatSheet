import static java.lang.System.out;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String className = "Bar";
        Class c = Class.forName(className);
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; ++i) {
            out.print("Klasa " + className + " ma metode '" + m[i].getName().toString() + "'");
            out.println(" ktora zwraca wartosc typu " + m[i].getReturnType().toString());
        }
    }
}
class Bar {
    public String fun(Integer i) {
        return "0" + i + ", zglos sie!";
    }
}