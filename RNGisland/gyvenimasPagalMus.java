package RNGisland;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gyvenimasPagalMus {

    static int peopleCount = (int) (Math.random()*1951) + 50;
    static int howManyYears;
    static int[] lulw = new int[peopleCount];
    static int[] poggers = new int[lulw.length];
    static int[] ezClap = new int[lulw.length];

    public static void main(String[] args) {

        int kazkas = 0;
        System.out.println(Arrays.toString(fill()));
        /*** ***/
        System.out.println("LOOOOOOOOOL!! "+Arrays.toString(generateAge()));
        System.out.println("Base people count: " + howManyPeople());
        countBase();
        while (kazkas < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite kiek praejo metu: ");
            howManyYears = scanner.nextInt();
            System.out.println(" kiek liko??? "+howManyAfterUpdate(howManyYears));
            kazkas++;
        }
    }
    static int[] fill() {
        for (int i=0;i<ezClap.length;i++) {
            ezClap[i] = -1;
        }
        return ezClap;
    }
    static int howManyAfterUpdate(int year) {
        return (howManyPeople() + newLife(howManyYears) - deaths(howManyYears) - fiftyPlus(howManyYears));
    }
    static int[] generateAge() {
        int maxAge = 99;
        for (int i=0;i<lulw.length;i++) {
            int ages = (int) ((Math.random()*maxAge)+1);
            lulw[i] = ages;
        }
        return lulw;
    }
    static int howManyPeople() {
        int count = 0;
        for (int i=0;i<lulw.length;i++) {
            count++;
        }
        return count;
    }
    static void countBase() {
        int count0to10 = 0,
                count11to20 = 0,
                count21to50 = 0,
                count50plus = 0;
        for (int i=0;i<lulw.length;i++) {
            if (lulw[i] <= 10) {
                count0to10++;
            }
            if (lulw[i] >=11 && lulw[i] <= 20) {
                count11to20++;
            }
            if (lulw[i] >=21 && lulw[i] <= 50) {
                count21to50++;
            }
            if (lulw[i] > 50) {
                count50plus++;
            }
        }
        System.out.println("Amziaus 0-10 m. grupeje yra: "+count0to10+" zmoniu");
        System.out.println("Amziaus 11-20 m. grupeje yra: "+count11to20+" zmoniu");
        System.out.println("Amziaus 21-50 m. grupeje yra: "+count21to50+" zmoniu");
        System.out.println("Amziaus nuo 50+ m. grupeje yra: "+count50plus+" zmoniu");
    }
    static int newLife(int year) {
        int age15to30 = 0,
                age31to50 = 0;
        Random Birth = new Random();
        for (int i=0;i<lulw.length;i++) {
            double chance = Birth.nextDouble();
            if (lulw[i] >=15 && lulw[i] <= 30 && chance < 0.1+(0.1*year)) {
                age15to30++;
                ezClap[i] = 0;
            }
            if (lulw[i] > 30 && lulw[i] <= 50 && chance < 0.05+(0.05*year)) {
                age31to50++;
                ezClap[i] = 0;
            }
        }
        System.out.println("Amziaus 15-30 palikuoniai: "+age15to30);
        System.out.println("Amziaus 31-50 palikuoniai: "+age31to50);
        System.out.println("Kiek gime zmogeliuku: "+(age15to30+age31to50));
        return age15to30+age31to50;
    }
    static int deaths(int year) {
        int count0to10 = 0,
                count11to20 = 0,
                count21to50 = 0;
        Random Deaths = new Random();
        for (int i=0;i<lulw.length;i++) {
            double chance = Deaths.nextDouble();
            if ( lulw[i] <= 10 && chance < 0.05+(0.05*year) ) {
                count0to10++;
            } else { ezClap[i] = lulw[i]; }
            if (lulw[i] >=11 && lulw[i] <= 20 && chance < 0.02+(0.02*year)) {
                count11to20++;
            } else { ezClap[i] = lulw[i]; }
            if (lulw[i] >=21 && lulw[i] <= 50 && chance < 0.05+(0.05*year)) {
                count21to50++;
            } else { ezClap[i] = lulw[i]; }
        }
        System.out.println("Amziaus grupeje 0-10 mire: "+count0to10 + " zmoniu");
        System.out.println("Amziaus grupeje 11-20 mire: "+count11to20 + " zmoniu");
        System.out.println("Amziaus grupeje 21-50 mire: "+count21to50 + " zmoniu");
        return count0to10+count11to20+count21to50;
    }
    static int fiftyPlus(int year) {
        int count50plus = 0;
        Random Deaths = new Random();
        for (int i=0;i<lulw.length;i++) {
            double chance = Deaths.nextDouble();
            if (lulw[i] > 50 && chance < 0.1 + (0.02 * year)) {
                count50plus++;
            } else {
                ezClap[i] = lulw[i];
            }
        }
        System.out.println("Amziaus grupeje 50+ mire: "+ count50plus+" zmoniu.");
        return count50plus;
    }
}

/** if (f < 0.1){
 return 1;
 } else if (f < 0.1 + 0.1){
 return 2;
 } else if (f < 0.1 + 0.1 + 0.35){
 return 3;
 ... can you see the pattern
 **/



/**
 Mirtis.
 Jei žmogeliukas papuola į tam tikras amžiaus grupes tai jis miršta pagal tam tikrą tikimybę.
 pvz.:
 jei žmogeliuko amžius nuo 0 iki 10 tai tikimybė jam numirti 5%;
 jei žmogeliuko amžius nuo 11 iki 20 tai tikimybė jam numirti 2%;
 jei žmogeliuko amžius nuo 21 iki 50 tai tikimybė jam numirti 5%;
 jei žmogeliuko amžius virš 50 tai tikimybė jam numirti 10% ir kiekvienais metais didėja 2%;
 **/
