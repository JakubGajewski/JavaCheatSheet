import java.util.Objects;

public class Dog implements Cloneable{
    private String name;
    private String color;
    Dog (String name, String color){
        this.name = name;
        this.color = color;
    };

    public Dog() {
    }

    public void printAbout() {
        System.out.println("piesek nasz to:");
        System.out.println(name);
        System.out.println(color);
        System.out.println();
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getColor (String color) {
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color);
    }
}
