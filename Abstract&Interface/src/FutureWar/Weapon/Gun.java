package FutureWar.Weapon;

public interface Gun {
    public static final double CALIBRE = 0.44;
    double zupa = 15;

    String shoot();
    // metody - domyślnie publiczne i abstarkcyjne

    public static String armageddon () {
        return  "Everybod is dead \n Metody statyczne w interfejsie, nowość od Javy 8!!!";
    } //od javy 8 jest

    default String celownikLaserowy() {
        return "celujemy laserowo taka nowość dodaję jako default żeby była kompatybilność wsteczna";
    }

    private String reload() {
        return "Cyk cyk, przeładowuję w prywatności";
    }
}
