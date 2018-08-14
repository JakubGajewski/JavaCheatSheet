package WarOfRobots;
import Weapon.Gun;

public class HumanKiller extends Robot implements Gun {


    @Override
    public String introduceMyself() {
        return "Hi, I am robot who kill people!";
    }

    @Override
    public String shoot() {
        return "Bang bang, somebody is dead!";
    }

    @Override
    public String singASong() {
        return "lalala ludobójczą śpiewam pieśń, to już konkret";
    }
}
