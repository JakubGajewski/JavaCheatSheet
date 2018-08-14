package Hospital;

import java.util.Objects;

public class Person {

    public Person(String name, String surname, int wages) {
        this.name = name;
        this.surname = surname;
        this.wages = wages;
    }

    private String name;
    private String surname;
    private int wages;

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

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return wages == person.wages &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, wages);
    }

    @Override
    public String toString() {
        return this.getClass() +
                " name= " + name +
                ", surname= '" + surname +
                ", wages=" + wages;
    };
    }

