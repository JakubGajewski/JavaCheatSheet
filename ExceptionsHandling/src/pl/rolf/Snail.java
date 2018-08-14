package pl.rolf;

import java.util.Date;

public class Snail {
    private String name;
    private Date birthday;
    private Float weight;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getStringBirthday() {
        return birthday + "";
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    String whatIsYourName() {
        return ("Hello, I am " + this.getName() + ", I was born " + (this.getStringBirthday()).substring(0,10) + " year " + (this.getStringBirthday()).substring(24) + ", I weight " + this.getWeight() + " pounds. My owner's name is " + this.getOwnerName() + ".");
    }
}
