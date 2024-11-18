package Lab_4;

public class Echipament {
    enum Zona_mag {A,B,C}
    enum Situatie{ACHIZITIONAT,EXPUS,VANDUT}

    private String denumire;
    private int nr_inv;
    private int pret;
    private Zona_mag zona;
    private Situatie situatie;

    public Echipament(String denumire, int nr_inv, int pret, Zona_mag zona,Situatie situatie)
    {
        this.denumire=denumire;
        this.nr_inv=nr_inv;
        this.pret=pret;
        this.zona=zona;
        this.situatie=situatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Zona_mag getZona() {
        return zona;
    }

    public void setZona(Zona_mag zona) {
        this.zona = zona;
    }

    public Situatie getSituatie() {
        return situatie;
    }

    public void setSituatie(Situatie situatie) {
        this.situatie = situatie;
    }

    @Override
    public String toString() {
        return "Echipament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona=" + zona +
                ", situatie=" + situatie +
                '}';
    }
}

