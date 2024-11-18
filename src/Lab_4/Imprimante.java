package Lab_4;

public class Imprimante extends Echipament{

    enum Mod {COLOR, ALB_NEGRU}

    private int ppm;
    private int rezolutie;
    private Mod mod;

    public Imprimante(String denumire, int nr_inv, int pret, Zona_mag zona,Situatie situatie, int ppm, int rezolutie, Mod mod)
    {
        super(denumire, nr_inv, pret, zona,situatie);
        this.ppm=ppm;
        this.rezolutie=rezolutie;
        this.mod=mod;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public Mod getMod() {
        return mod;
    }

    public void setMod(Mod mod) {
        this.mod = mod;
    }

    @Override
    public String toString() {
        return "Imprimante{" +
                "ppm=" + ppm +
                ", rezolutie=" + rezolutie +
                ", mod=" + mod +
                '}';
    }
}
