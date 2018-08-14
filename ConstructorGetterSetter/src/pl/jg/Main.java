package pl.jg;

public class Main {
    public static void main(String[] args) {
        Person p001 = new Person();
        p001.setAge(50);
        System.out.println(p001.getName() + p001.getSurname() + p001.getAge());

        Person p002 = new Person("Katrina");
        System.out.println(p002.getName());
    }

}

