package RNGisland;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gyvenimasPagalMus {

    static int peopleCount = (int) (Math.random()*1951) + 50;
    static People[] localIslanders = new People[peopleCount];
    static int howManyYears;

    public static void main(String[] args) {

        int kazkas = 0;
        /*** ***/
        System.out.println("Base people count: " + howManyPeople());
        System.out.println(Arrays.toString(generateAge()));
        countBase();
        while (kazkas < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite kiek praejo metu: ");
            howManyYears = scanner.nextInt();
            newLife();
            deaths(howManyYears);
//        System.out.println(islandUpdate());
            People[] afterUpdate = new People[islandUpdate()];
            System.out.println(howManyAfterUpdate(afterUpdate));
            System.out.println(Arrays.toString(afterUpdate));
            kazkas++;
        }
    }
    static int howManyAfterUpdate(People[] afterUpdate) {
        int count = 0;
        for (int i=0;i<afterUpdate.length;i++) {
            People zmogeliukas = new People();
            zmogeliukas.setAge(localIslanders[i].getAge());
            afterUpdate[i] = zmogeliukas;
            count++;
        }
        return count;
    }
    static int islandUpdate() {
        int upd = (howManyPeople()+newLife()-deaths());
        System.out.println("Siais metais gime: " + newLife() + " zmones, mire: "+deaths()+". " +
                "Saloje zmoniu kiekis pakito nuo: "+howManyPeople()+" iki: "+upd+".");
        return upd;
    }
    static People[] generateAge() {
        int maxAge = 100;
        for (int i=0;i<localIslanders.length;i++) {
            int ages = (int) (Math.random()*maxAge);
            People human = new People();
            human.setAge(ages);
            localIslanders[i] = human;
        }
        return localIslanders;
    }
    static int howManyPeople() {
        int count = 0;
        for (int i=0;i<localIslanders.length;i++) {
            count++;
        }
        return count;
    }
    static void countBase() {
        int count0to10 = 0,
                count11to20 = 0,
                count21to50 = 0,
                count50plus = 0;
        for (int i=0;i<localIslanders.length;i++) {
            if (localIslanders[i].getAge() <= 10) {
                count0to10++;
            }
            if (localIslanders[i].getAge() >=11 && localIslanders[i].getAge() <= 20) {
                count11to20++;
            }
            if (localIslanders[i].getAge() >=21 && localIslanders[i].getAge() <= 50) {
                count21to50++;
            }
            if (localIslanders[i].getAge() > 50) {
                count50plus++;
            }
        }
        System.out.println("Amziaus 0-10 m. grupeje yra: "+count0to10+" zmoniu");
        System.out.println("Amziaus 11-20 m. grupeje yra: "+count11to20+" zmoniu");
        System.out.println("Amziaus 21-50 m. grupeje yra: "+count21to50+" zmoniu");
        System.out.println("Amziaus nuo 50+ m. grupeje yra: "+count50plus+" zmoniu");
    }
    static int newLife() {
        int age15to30 = 0,
            age31to50 = 0;
        Random Birth = new Random();
        for (int i=0;i<localIslanders.length;i++) {
            double chance = Birth.nextDouble();
            if (localIslanders[i].getAge() >=15 && localIslanders[i].getAge() <= 30 && chance < 0.1) {
                age15to30++;
            }
            if (localIslanders[i].getAge() > 30 && localIslanders[i].getAge() <= 50 && chance < 0.05) {
                age31to50++;
            }
        }
        System.out.println("Amziaus 15-30 palikuoniai: "+age15to30);
        System.out.println("Amziaus 31-50 palikuoniai: "+age31to50);
        System.out.println("Kiek gime zmogeliuku: "+(age15to30+age31to50));
        return age15to30+age31to50;
    }
    static int deaths(int years) {
        int count0to10 = 0,
            count11to20 = 0,
            count21to50 = 0;
        int count50plus = 0;
        Random Deaths = new Random();
        for (int i=0;i<localIslanders.length;i++) {
            double chance = Deaths.nextDouble();
            if ( localIslanders[i].getAge() <= 10 && chance < 0.05 ) {
                count0to10++;
            }
            if (localIslanders[i].getAge() >=11 && localIslanders[i].getAge() <= 20 && chance < 0.02) {
                count11to20++;
            }
            if (localIslanders[i].getAge() >=21 && localIslanders[i].getAge() <= 50 && chance < 0.05) {
                count21to50++;
            }
            if (localIslanders[i].getAge() > 50 && chance < 0.1+(0.02 * years))  {
                count50plus++;
            }
        }
        System.out.println("Amziaus grupeje 0-10 mire: "+count0to10 + " zmoniu");
        System.out.println("Amziaus grupeje 11-20 mire: "+count11to20 + " zmoniu");
        System.out.println("Amziaus grupeje 21-50 mire: "+count21to50 + " zmoniu");
        System.out.println("Amziaus grupeje 50+ mire: "+count50plus + " zmoniu");
        System.out.println("Kiek mire zmogeliuku: "+(count0to10+count11to20+count21to50+count50plus));
        return count0to10+count11to20+count21to50+count50plus;
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
