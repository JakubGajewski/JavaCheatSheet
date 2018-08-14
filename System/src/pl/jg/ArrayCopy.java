package pl.jg;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] pierwszy = {1,2,3,4,5,6,7,8,9};
        int[] drugi = new int[3];
        System.arraycopy(pierwszy, 3, drugi,0,3);
        System.out.println(Arrays.toString(drugi));

    }
}

