package WarOfRobots;

import Weapon.Gun;

public abstract class Robot {

    private String material = "steel";

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String singASong() {
        return "lalala robotniczą śpiewam pieśń, ale abstrakcja";
    }

    public abstract String introduceMyself();

    public String killPeople (int numberOfPeopleToKill) {
        return numberOfPeopleToKill + "people are killed";
    };

    public String skrzypi() {
        return "Iiiijiiijiiiiiii robot abstrakcyjny skrzypi jak każdy";
    }




}
