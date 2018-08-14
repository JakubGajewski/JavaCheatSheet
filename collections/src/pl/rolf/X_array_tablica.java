package pl.rolf;

import com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory;
import java.lang.reflect.Array;
import java.util.Arrays;

public class X_array_tablica {

    public static void main(String[] args) {

        int[] frameSize = {
                15, 17, 19,
                21, 23,
                25, 27, 29, 31, 33
        };
        char[] frameSize2 = {'S', 'M', 'L'};

        System.out.println(frameSize[frameSize.length - 1]);

        System.out.println(frameSize.length); ///array.length is PROPERTY!!! so we don't have "()"!!!

        for (int frame : frameSize) {
            System.out.println(frame);
        }

        for (char frame : frameSize2) {
            System.out.println(frame);
        }

        double[] wheels = new double[3];
        wheels[0] = 26;
        wheels[1] = 27.5f;
        wheels[2] = 29d;

        System.out.println(Arrays.toString(wheels));

        System.out.println("");

        System.out.println(Array.getLength(wheels));
        System.out.println(wheels.length);


        DefaultMXBeanMappingFactory f1 = new DefaultMXBeanMappingFactory();
        DefaultMXBeanMappingFactory f2 = new DefaultMXBeanMappingFactory();

        DefaultMXBeanMappingFactory[] industrialZone = new DefaultMXBeanMappingFactory[2];

        industrialZone[0] = f1;
        industrialZone[1] = f2;


    }

}