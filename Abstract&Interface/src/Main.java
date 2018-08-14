import WarOfRobots.HumanKiller;
import WarOfRobots.Robot;
import WarOfTanks.TankRudy102;
import Weapon.Gun;

public class Main {

    public static void main(String[] args) {

        //nie da się zrobić instancji klasy abstrakcyjnej:
        // Robot rXdX = new Robot();
        //to nie przejdzie

        HumanKiller r2d2 = new HumanKiller();
        System.out.println(r2d2.skrzypi());
        System.out.println(r2d2.introduceMyself());
        System.out.println(r2d2.getMaterial());
        System.out.println(r2d2.singASong());
        //System.out.println(HumanKiller.armageddon()); nie działą, bo to static

        System.out.println();
        System.out.println();
        System.out.println();

        Robot r2d3 = new HumanKiller();
        System.out.println(r2d3.skrzypi());
        System.out.println(r2d3.introduceMyself());
        System.out.println(r2d3.getMaterial());
        System.out.println(r2d3.singASong());
        //takie już nie działa:
        // System.out.println(r2d3.zupa);
        // trzeba tak:
        System.out.println(((HumanKiller) r2d3).zupa);

        System.out.println();
        System.out.println();
        System.out.println();

        Gun gun = new Gun() {
            @Override
            public String shoot() {
                return "Pfu pfu anonim strzela!";
            }
        };

        System.out.println(gun.shoot());
        System.out.println(gun.celownikLaserowy());
        System.out.println(gun.zupa);
        //a to nie przejdzie - bez instancji nie da się wywołać metody statycznej;System.out.println(gun.armageddon());
        System.out.println(gun.zupa);
        System.out.println(Gun.armageddon());

        System.out.println();
        System.out.println();
        System.out.println();



    }
}
