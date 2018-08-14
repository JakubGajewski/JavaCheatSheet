package pl.jg;

public class LambdaDemo {
    public static void main(String[] args) {
        String name;
        MyNameIs myName;
        myName = () -> "Błażej";
        System.out.println(myName.getName());
    }
}
interface MyNameIs {
    String getName();
}
