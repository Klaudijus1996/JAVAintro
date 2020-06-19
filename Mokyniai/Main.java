package Mokyniai;
import java.util.*;

public class Main {

    static int mokiniuSkaicius = 5;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];

    public static void main(String[] args) {
        /*** Generating random string ***/
        Random r = new Random();
        String abc = "abcdefghijklmnoprstuxw";
        String vardenis = "";
        for (int i=0;i<10;i++) {
            vardenis += abc.charAt(r.nextInt(abc.length()));
        }
        System.out.println("ar gavosi? "+vardenis);
        System.out.println("duok raide? "+vardenis.charAt(0));
        /*** Generating random string END ***/
        ivestiPradiniusDuomenis();
//        print("Pradiniai duomenys:");
//
//        pagalKlase();
//        print("Sulygiuota pagal klase:");
//
//        pagalVarda();
//        print("Lygiuot pagal varda:");
//
//        pagalKlasePavardeVarda();
//        print("Lygiuot pagal klase, pavarde ir varda");
//
//        pagalVardaPavardeKlase();
//        print("Lygiuot pagal varda, pavarde ir klase");


        System.out.println("\nDemo spausdinimas: " + Arrays.toString(mokiniai));
    }


    static void ivestiPradiniusDuomenis() {
        Mokinys mokinys1 = new Mokinys();
        mokinys1.setKlase(1);
        mokinys1.setVardas("Jonas");
        mokinys1.setPavarde("Jonaitis");
        mokiniai[0] = mokinys1;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.setKlase(2);
        mokinys2.setVardas("Ona");
        mokinys2.setPavarde("Onaite");
        mokiniai[1] = mokinys2;

        Mokinys mokinys3 = new Mokinys();
        mokinys3.setKlase(1);
        mokinys3.setVardas("Petras");
        mokinys3.setPavarde("Jonaitis");
        mokiniai[2] = mokinys3;

        Mokinys mokinys4 = new Mokinys();
        mokinys4.setKlase(1);
        mokinys4.setVardas("Jurga");
        mokinys4.setPavarde("Jurgaite");
        mokiniai[3] = mokinys4;

        Mokinys mokinys5 = new Mokinys();
        mokinys5.setKlase(2);
        mokinys5.setVardas("Antanas");
        mokinys5.setPavarde("Antanaitis");
        mokiniai[4] = mokinys5;
        System.out.println(Arrays.toString(mokiniai));
    }

//    static void print(int indeksas) {
//        System.out.println(mokiniai[indeksas].getKlase() + " " +
//                mokiniai[indeksas].vardas + " " +
//                mokiniai[indeksas].pavarde);
//    }
//
//    static void print(String title) {
//        System.out.println();
//        System.out.println(title);
//        for (int i = 0; i < mokiniai.length; i++) {
//            print(i);
//        }
//    }



    /*
     indeksas: 0  1  2 3 4 5
     korta:    4  8  5 7 1 2
     0:        1* 8  5 7 4 2
     1:        1  2* 8 7 5 4
     0. Turime is kortu nuo 0 iki 5 isrinkti maziausia ir padeti ja i 0 (!) pozicija
     1. Turime is kortu nuo 1 iki 5 isrinkti maziausia ir padeti ja i 1 pozicija
     ...
     n. Turime is kortu nuo n iki 5 isrinkti maziausia ir padeti ja i n pozicija
     */
/*** -------------- ***/

//    static void sukeiciamMokinius(int i, int j) {
//        Mokinys mokinys = mokiniai[i];
//        mokiniai[i] = mokiniai[j];
//        mokiniai[j] = mokinys;
//    }
//
//    static void pagalKlase() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].klase < mokiniai[zingsnis].klase) {
//                    // mokiniai[i] <-> mokiniai[zingsnis]
//                    sukeiciamMokinius(i, zingsnis);
//                }
//            }
//        }
//    }
//
//    static void pagalVarda() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0) {
//                    // mokiniai[i] <-> mokiniai[zingsnis]
//                    sukeiciamMokinius(i, zingsnis);
//                }
//            }
//        }
//    }
//
//    static void pagalKlasePavardeVarda() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].klase < mokiniai[zingsnis].klase) {
//                    sukeiciamMokinius(i, zingsnis);
//
//                } else if (mokiniai[i].klase == mokiniai[zingsnis].klase) {
//                    if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) < 0) {
//                        sukeiciamMokinius(i, zingsnis);
//
//                    } else if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) == 0) {
//                        if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0) {
//                            sukeiciamMokinius(i, zingsnis);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    static void pagalVardaPavardeKlase() {
//        Arrays.sort(mokiniai, (m1, m2) -> {
//            int pagalVarda = m1.vardas.compareTo(m2.vardas);
//            if (pagalVarda != 0) return pagalVarda;
//
//            int pagalPavarde = m1.pavarde.compareTo(m2.pavarde);
//            if (pagalPavarde != 0) return pagalPavarde;
//
//            return Integer.compare(m1.klase, m2.klase);
//        });
//    }
}
