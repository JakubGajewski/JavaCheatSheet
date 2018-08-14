package Hospital;

public class Doctor extends Person {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Doctor(String name, String surname, int wages, int bonus) {
        super(name, surname, wages);
        setBonus(bonus);
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus;
    };
}
