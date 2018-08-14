package pl.rolf;

import java.util.*;

public class X_iterator {
    public static void main(String[] args) {
        Imprezowicz Artur = new Imprezowicz("Artur", "Szwajkowski", 58);
        Imprezowicz Tomasz = new Imprezowicz("Tomasz", "Napiórkowski", 52);
        Imprezowicz Antonina = new Imprezowicz("Antonina", "Żaba", 159);

      List<Imprezowicz> imprezaSet = new LinkedList<>();

        imprezaSet.add(Artur);
        imprezaSet.add(Tomasz);
        imprezaSet.add(Antonina);

        Iterator<Imprezowicz> iteratorSetu = imprezaSet.iterator();
//        while (iteratorSetu.hasNext()) {
//            System.out.println(iteratorSetu.toString());
//        }
        while (iteratorSetu.hasNext()) {
            System.out.println(iteratorSetu.next().toString());
        }
    }
}

class Imprezowicz {
    private String name;
    private String surname;
    private int age;

    public Imprezowicz(String name, String surname, int age) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Imprezowicz{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
