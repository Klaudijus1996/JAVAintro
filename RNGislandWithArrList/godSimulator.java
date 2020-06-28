package RNGislandWithArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class godSimulator {
    static int peopleCount = (int) (Math.random()*1951) + 50;
    static ArrayList<Integer> localIslanders = new ArrayList<Integer>();
    static int howManyYears;

    public static void main(String[] args) {

        System.out.println("Generuoji amziu? "+generateAge());
        System.out.println("Kiek kartu? "+howManyPeople());
        countBase();

        howManyYears = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite kiek praejo metu: ");
            howManyYears = scanner.nextInt();
            if (howManyYears > 10) {
                break;
            }
            for (int i=1;i<=howManyYears;i++) {
                System.out.println("praejus "+i+" metams:");
                System.out.println("Kiek zmogeliuku saloje? "+howManyPeople());
                newLife();
                deaths(howManyYears);
                System.out.println("Kiek zmogeliuku saloje po teismo valandos? "+howManyPeople());
            }
        }
    }

    static ArrayList<Integer> generateAge() {
        int maxAge = 99;
        for (int i=0;i<peopleCount;i++) {
            int ages = (int) ((Math.random()*maxAge)+1);
            localIslanders.add(ages);
        }
        return localIslanders;
    }
    static int howManyPeople() {
        int count = 0;
        for (int i=0;i<localIslanders.size();i++) {
            count++;
        }
        return count;
    }
    static void countBase() {
        int count0to10 = 0,
                count11to20 = 0,
                count21to50 = 0,
                count50plus = 0;
        for (int i=0;i<localIslanders.size();i++) {
            if (localIslanders.get(i) <= 10) {
                count0to10++;
            }
            if (localIslanders.get(i) >=11 && localIslanders.get(i) <= 20) {
                count11to20++;
            }
            if (localIslanders.get(i) >=21 && localIslanders.get(i) <= 50) {
                count21to50++;
            }
            if (localIslanders.get(i) > 50) {
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
        for (int i=0;i<localIslanders.size();i++) {
            double chance = Birth.nextDouble();
            if (localIslanders.get(i) >=15 && localIslanders.get(i) <= 30 && chance < 0.1) {
                age15to30++;
                localIslanders.add(0);
            }
            if (localIslanders.get(i) > 30 && localIslanders.get(i) <= 50 && chance < 0.05) {
                age31to50++;
                localIslanders.add(0);
            }
        }
        System.out.println("Kiek gime zmogeliuku: "+(age15to30+age31to50));
        return age15to30+age31to50;
    }
    static int deaths(int year) {
        int count0to10 = 0,
                count11to20 = 0,
                count21to50 = 0;
        int count50plus = 0;
        Random Deaths = new Random();
        for (int i=0;i<localIslanders.size();i++) {
            double chance = Deaths.nextDouble();
            if ( localIslanders.get(i) <= 10 && chance < 0.05 ) {
                count0to10++;
                localIslanders.remove(localIslanders.get(i));
            }
            if (localIslanders.get(i) >=11 && localIslanders.get(i) <= 20 && chance < 0.02) {
                count11to20++;
                localIslanders.remove(localIslanders.get(i));
            }
            if (localIslanders.get(i) >=21 && localIslanders.get(i) <= 50 && chance < 0.05) {
                count21to50++;
                localIslanders.remove(localIslanders.get(i));
            }
            if (localIslanders.get(i) > 50 && chance < 0.1 + (0.02*year)) {
                count50plus++;
                localIslanders.remove(i);
            }
        }
        System.out.println("Kiek mire zmogeliuku: "+(count0to10+count11to20+count21to50+count50plus));
        return count0to10+count11to20+count21to50+count50plus;
    }
}
