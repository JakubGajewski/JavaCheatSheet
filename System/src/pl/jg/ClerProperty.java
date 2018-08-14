package pl.jg;
import java.lang.*;

public class ClerProperty {

    public class SystemDemo {

        public static void main(String[] args) {

            // returns the previous string value of the system property
            String s = System.clearProperty("java.class.path");

            // sets the system property
            System.setProperty("user.dir", "C:/tutorialspoint/java");

            // gets the system property after changes done by setProperty
            System.out.println(System.getProperty("user.dir"));
        }
    }
}
