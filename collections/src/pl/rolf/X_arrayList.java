package pl.rolf;

import com.sun.deploy.net.protocol.about.Handler;

import java.util.ArrayList;
import java.util.List;

public class X_arrayList {

    public static void main(String[] args) {

        String bike0 = "Scott CR1";
        String bike1 = "Bike Tech Hikari LX";
        String bike2 = "Accent Apex";

        List<String> bikeList = new ArrayList<>();

        bikeList.add(bike0);
        bikeList.add(bike1);
        bikeList.add(bike2);

        bikeList.add("Specialized Allez");

        String[] bikeX = {"Ridgeback", "Raleigh"};

        for (String bike : bikeX) {
            bikeList.add(bike);
        }

        System.out.println(bikeList);

        System.out.println(bikeList.get(2));

        for (String bike : bikeList) {
            System.out.print(bike + ", ");
        }
        System.out.println();

        //List<int> pirmitiveList = new ArrayList<>();
        //Type argument CAN NOT be primitive!

        List bigos = new ArrayList();
        bigos.add("kapusta");
        class Cabage {
            String taste;
        }
        Cabage cabage = new Cabage();
        bigos.add(cabage);
        bigos.add(123);







    }
}
