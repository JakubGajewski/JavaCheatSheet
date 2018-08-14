//Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.

package pl.jg;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person() {  /*- A constructor name must be same as its class name. A constructor must have no explicit return type. */
        this.setName("John");
    }

    public Person(String name){
        this.setName(name);
    }

    public int getAge (){
        return age;
    }

    public void setAge(int age){
        this.age = age;
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
}