package mokinys;

import java.util.Arrays;

public class Mokinys {
    static int mokiniuSkaicius = 6;
    static mokiniai[] pupils = new mokiniai[mokiniuSkaicius];

    public static void main(String[] args) {

        mokiniai mokinys1 = new mokiniai();
        mokinys1.vardas = "Jonas";
        mokinys1.pavarde = "Jonaitis";
        mokinys1.klase = 1;
        pupils[0] = mokinys1;
        mokiniai mokinys2 = new mokiniai();
        mokinys2.vardas = "Ona";
        mokinys2.pavarde = "Onaite";
        mokinys2.klase = 2;
        pupils[1] = mokinys2;
        mokiniai mokinys3 = new mokiniai();
        mokinys3.vardas = "Petras";
        mokinys3.pavarde = "Jonaitis";
        mokinys3.klase = 1;
        pupils[2] = mokinys3;
        mokiniai mokinys4 = new mokiniai();
        mokinys4.vardas = "Jurga";
        mokinys4.pavarde = "Jurgaite";
        mokinys4.klase = 1;
        pupils[3] = mokinys4;
        mokiniai mokinys5 = new mokiniai();
        mokinys5.vardas = "Antanas";
        mokinys5.pavarde = "Antanaitis";
        mokinys5.klase = 2;
        pupils[4] = mokinys5;
        mokiniai mokinys6 = new mokiniai();
        mokinys6.vardas = "Kilimandzaras";
        mokinys6.pavarde = "Jonaitis";
        mokinys6.klase = 1;
        pupils[5] = mokinys6;

        System.out.println(Arrays.toString(pupils));
        printing(pupils);


    }
    static void printing(mokiniai[] pupils) {
        mokiniai[] sortedObj = miracleSorting(pupils);
        for (int i=0;i<sortedObj.length;i++) {
            System.out.println(sortedObj[i].vardas + " " + sortedObj[i].pavarde);
        }
    }
    static mokiniai[] miracleSorting(mokiniai[] pupils) {
        mokiniai temp;
        mokiniai anotherTemp;
        mokiniai andYetAnotherTemp;
        /** ???? **/
        for (int i=0;i<pupils.length;i++) {
            for (int j=i+1;j<pupils.length;j++) {
                if (pupils[i].klase > pupils[j].klase) {
                    temp = pupils[j];
                    pupils[j] = pupils[i];
                    pupils[i] = temp;
                }
            }
        }
        /** ???????????? **/
        for (int j=0;j<pupils.length;j++) {
            for (int i=j+1;i<pupils.length;i++) {
                if (pupils[i].pavarde.compareTo(pupils[j].pavarde) < 0 && pupils[i].klase == pupils[j].klase) {
                    anotherTemp = pupils[j];
                    pupils[j] = pupils[i];
                    pupils[i] = anotherTemp;
                }
            }
        }
        /** ???????????? **/
        for (int j=0;j<pupils.length; ++j) {
            for (int i=j+1;i<pupils.length;i++) {
                if (pupils[i].vardas.compareTo(pupils[j].vardas) < 0 && pupils[i].pavarde.compareTo(pupils[j].pavarde) == 0 && pupils[i].klase == pupils[j].klase) {
                    andYetAnotherTemp = pupils[j];
                    pupils[j] = pupils[i];
                    pupils[i] = andYetAnotherTemp;
                }
            }
        }
        return pupils;
    }
}
/**
 Jonas Jonaitis 1               Jonas Jonaitis
 Ona Onaite 2                   Petras Jonaitis
 Petras Jonaitis 1    --->      Jurga Jurgaite
 Jurga Jurgaite 1               Antanas Antanaitis
 Antanas Antanaitis 2           Ona Onaite
 **/