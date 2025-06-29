package Lab_3.ex2;

import java.time.LocalDate;

public class Produs {
    private String denumire;
    private double pret;
    private int cantitate;
    private LocalDate data;

    public Produs(String denumire, double pret, int cantitate, LocalDate data) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.data = data;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", data=" + data +
                '}';
    }

    public void vindeProdus(int cantitate) {
        if (this.cantitate >= cantitate) {
            this.cantitate -= cantitate;
            System.out.println(cantitate + denumire + " au fost vandute");
        } else {
            System.out.println("nu mai e pe stoc " + this.cantitate);
        }
    }
}
