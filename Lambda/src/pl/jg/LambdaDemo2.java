package pl.jg;

interface NumericTest {
    boolean test (int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;


    }
}

