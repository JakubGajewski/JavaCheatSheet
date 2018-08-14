package pl.jg;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        File pliczek = new File("C:\\fileCreatedByJava.txt");

           try {
                pliczek.createNewFile();
                System.out.println(pliczek + " created!");
            }
            catch (IOException e) {
                System.out.println("IO Exception");
            }


    }
}