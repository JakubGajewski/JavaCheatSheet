package pl.jg;

interface Love {
    String loveMe(String lover);
}

public class LambdaMoja {
    public static void main(String[] args) {
        Love toLoveSomeone = (lover)  -> "I love" + lover;
        System.out.println(toLoveSomeone.toString());

    }
}
