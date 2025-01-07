package Lab_4;

public class Sisteme extends Echipament {

    enum SO {WINDOWS, LINUX}

    private String tip_m;
    private double viteza;
    private int capacitate;
    private SO operare;


    public Sisteme(String denumire, int nr_inv, int pret, Zona_mag zona, Situatie situatie, String tip_m, double viteza, int capacitate, SO operare) {
        super(denumire, nr_inv, pret, zona, situatie);
        this.tip_m = tip_m;
        this.viteza = viteza;
        this.capacitate = capacitate;
        this.operare = operare;
    }

    public String getTip_m() {
        return tip_m;
    }

    public void setTip_m(String tip_m) {
        this.tip_m = tip_m;
    }

    public double getViteza() {
        return viteza;
    }

    public void setViteza(double viteza) {
        this.viteza = viteza;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public SO getOperare() {
        return operare;
    }

    public void setOperare(SO operare) {
        this.operare = operare;
    }

    @Override
    public String toString() {
        return "Sisteme{" +
                "tip_m='" + tip_m + '\'' +
                ", viteza=" + viteza +
                ", capacitate=" + capacitate +
                ", operare=" + operare +
                '}';
    }
}
