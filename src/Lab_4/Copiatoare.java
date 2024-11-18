package Lab_4;

public class Copiatoare extends Echipament{
    enum Format {A3, A4}

    private int nrpag;
    private String p_ton;
    private Format format;

    public Copiatoare(String denumire, int nr_inv, int pret, Zona_mag zona,Situatie situatie, int nrpag, String p_ton, Format format)
    {
        super(denumire, nr_inv, pret, zona,situatie);
        this.nrpag=nrpag;
        this.p_ton=p_ton;
        this.format=format;
    }

    public int getNrpag() {
        return nrpag;
    }

    public void setNrpag(int nrpag) {
        this.nrpag = nrpag;
    }

    public String getP_ton() {
        return p_ton;
    }

    public void setP_ton(String p_ton) {
        this.p_ton = p_ton;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Copiatoare{" +
                "nrpag=" + nrpag +
                ", p_ton='" + p_ton + '\'' +
                ", format=" + format +
                '}';
    }
}
