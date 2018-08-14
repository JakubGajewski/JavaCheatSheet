import java.util.Objects;

public class KonstrukcjaBudowlana {

    private String rodzaj;
    private double wysokość;
    private int tonaż;

    public KonstrukcjaBudowlana(String rodzaj, int tonaż) {
        this.setRodzaj(rodzaj);
        this.tonaż = tonaż;
    }

    public KonstrukcjaBudowlana(String rodzaj, double wysokość, int tonaż) {
        this(rodzaj, tonaż);
        this.wysokość = wysokość;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public double getWysokość() {
        return wysokość;
    }

    public void setWysokość(double wysokość) {
        this.wysokość = wysokość;
    }

    public int getTonaż() {
        return tonaż;
    }

    public void setTonaż(int tonaż) {
        this.tonaż = tonaż;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KonstrukcjaBudowlana that = (KonstrukcjaBudowlana) o;
        return Double.compare(that.wysokość, wysokość) == 0 &&
                tonaż == that.tonaż &&
                Objects.equals(rodzaj, that.rodzaj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rodzaj, wysokość, tonaż);
    }

    @Override
    public String toString() {
        return "KonstrukcjaBudowlana{" +
                "rodzaj='" + rodzaj + '\'' +
                ", wysokość=" + wysokość +
                ", tonaż=" + tonaż +
                '}';
    }
}
