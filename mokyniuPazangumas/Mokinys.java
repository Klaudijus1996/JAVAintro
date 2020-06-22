package mokyniuPazangumas;

import java.util.Arrays;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private int klase;
    private int[] trimestras;
    private double average;
    private int roundedAverage;

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

    public int[] getTrimestras() {return trimestras;}

    public void setTrimestras(int[] trimestras) {this.trimestras = trimestras; }

    public double getAverage() {return average;}

    public void setAverage(double average) {this.average = average; }

    public int getRoundedAverage() {return roundedAverage;}
    public void setRoundedAverage(int roundedAverage) {this.roundedAverage = roundedAverage; }

    @Override
    public String toString() {
        return klase + " " + vardas + " " + pavarde + " " + Arrays.toString(trimestras) + " "+average;
    }
    // sukurti mokyniu masyva pvz: "Vardene","Pavardene",3,[8,10,9,9,10,9]
    // surasti ir atspausdinti mokini su maziausiu vidurkiu
    // surasti ir atspausdinti 3 geriausiai besimokancius mokinius su ju vidurkiais - mazejimo tvarka
}
