package Hospital;

public class Nurse extends Person {

    private int overtime;

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public Nurse(String name, String surname, int wages, int overtime) {
        super(name, surname, wages);
        setOvertime(overtime);
    }

    @Override
    public String toString() {
        return super.toString() + this.getOvertime() + " ";
    }

}
