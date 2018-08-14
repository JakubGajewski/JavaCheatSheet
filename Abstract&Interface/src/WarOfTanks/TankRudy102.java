package WarOfTanks;
import Weapon.Gun;

public class TankRudy102 implements Gun {

    @Override
    public String shoot() {
        return "BOOOM tank is crashed!";
    }

    public String crushTheWalls (int i) {
        return "Number of walls crashed " + i;
    }

}
