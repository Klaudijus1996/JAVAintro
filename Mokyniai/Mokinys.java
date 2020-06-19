package Mokyniai;
public class Mokinys {
    private String vardas;
    private String pavarde;
    private int klase;

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    @Override
    public String toString() {
        return klase + " " + vardas + " " + pavarde;
    }
}
