package Mokyniai;
import java.util.*;

public class Main {

    static int mokiniuSkaicius = 100000;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];

    public static void main(String[] args) {
        /*** Iskvieciam 'mokiniu.length() generavima' ***/
        vykstaDalykai(mokiniai);

        long startTime = System.currentTimeMillis();
        pagalKlasePavardeVarda();
        long stopTime = System.currentTimeMillis();
        System.out.println("Kiek ms trunka atlikti rusiavima nenaudojant .sort(): ");
        System.out.println((stopTime - startTime)); // jeigu .length() > 100, tai lauksim nuo 870 ms.
        long startNewTime= System.currentTimeMillis();
        pagalVardaPavardeKlase();
        long stopNewTime = System.currentTimeMillis();
        System.out.println("Kiek ms trunka atlikti rusiavima naudojant .sort(): ");
        System.out.println(stopNewTime - startNewTime); // jeigu .length() <== 100 000 , tai lauksim 400 ms++

        System.out.println("\nDemo spausdinimas: " + Arrays.toString(mokiniai));
    }
    /*** Generating Random Grade ***/
    static int randomGrade() {
        int klase = 0;
        for (int i=0;i<=12;i++) {
            klase = (int)(Math.random()*12);
        }
        return klase;
    }
    /*** Generating Random Name ***/
    static String randomName() {
        Random r = new Random();
        String abc = "abcdefghijklmnoprstuxw";
        String vardenis = "";
        for (int i=0;i<5;i++) {
            vardenis += abc.charAt(r.nextInt(abc.length()));
        }
        return vardenis;
    }
    /*** Generating Random Lastname ***/
    static String randomLastName() {
        Random r = new Random();
        String abc = "abcdefghijklmnoprstuxw";
        String pavardenis = "";
        for (int i=0;i<7;i++) {
            pavardenis += abc.charAt(r.nextInt(abc.length()));
        }
        return pavardenis;
    }
    /*** Generating object ***/
    static Mokinys[] vykstaDalykai(Mokinys[] mokiniai){
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
        for (int i=5;i<mokiniai.length;i++){
            Mokinys mokinys = new Mokinys();
            mokinys.setKlase(randomGrade());
            mokinys.setVardas(randomName());
            mokinys.setPavarde(randomLastName());
            mokiniai[i] = mokinys;
        }
        return mokiniai;
    }
    static void sukeiciamMokinius(int i, int j) {
        Mokinys mokinys = mokiniai[i];
        mokiniai[i] = mokiniai[j];
        mokiniai[j] = mokinys;
    }
    /*** Sorting without using .sort() ***/
    static void pagalKlasePavardeVarda() {
        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {

            for (int i = zingsnis; i < mokiniai.length; i++) {

                if (mokiniai[i].getKlase() < mokiniai[zingsnis].getKlase()) {
                    sukeiciamMokinius(i, zingsnis);

                } else if (mokiniai[i].getKlase() == mokiniai[zingsnis].getKlase()) {
                    if (mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde()) < 0) {
                        sukeiciamMokinius(i, zingsnis);

                    } else if (mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde()) == 0) {
                        if (mokiniai[i].getVardas().compareTo(mokiniai[zingsnis].getVardas()) < 0) {
                            sukeiciamMokinius(i, zingsnis);
                        }
                    }
                }
            }
        }
    }
    /*** Sorting using .sort() ***/
    static void pagalVardaPavardeKlase() {
        Arrays.sort(mokiniai, (m1, m2) -> {
            int pagalVarda = m1.getVardas().compareTo(m2.getVardas());
            if (pagalVarda != 0) return pagalVarda;

            int pagalPavarde = m1.getPavarde().compareTo(m2.getPavarde());
            if (pagalPavarde != 0) return pagalPavarde;

            return Integer.compare(m1.getKlase(), m2.getKlase());
        });
    }
}
