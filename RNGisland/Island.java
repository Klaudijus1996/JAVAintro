package RNGisland;

import java.util.ArrayList;
import java.util.Scanner;

public class Island {
    static int peopleCount = (int) (Math.random()*1951) + 50;
    static ArrayList<People> localIslanders = new ArrayList<>();
    static int howManyYears;
    static int yearCount;

    public static void main(String[] args) {
        generateAge();
        while (localIslanders.size() > 1) {
            System.out.println("Iveskite kiek praejo metu: ");
            Scanner scanner = new Scanner(System.in);
            /*** bandom validuoti scanner 'inputa' (deja nepavyko :( ***/
            if(!scanner.hasNextInt()) {
                System.out.println("Iveskite normalu skaiciu: ");
//                break;
            } else {
                howManyYears = scanner.nextInt();
            }
            for (int i=1;i<=howManyYears;i++) {
                System.out.println("praejus "+i+" metams:");
                System.out.println("Populiacijos skaicius pries susirinkima: "+howManyPeople());
                Calculations.newLife();
                Calculations.deaths(yearCount);
                System.out.println("Pakites populiacijos skaicius: "+howManyPeople());
                System.out.println("Year count: "+yearCount);
            }
        }
    }
    /*** Generauojam amziu ***/
    static ArrayList<People> generateAge() {
        int maxAge = 99;
        for (int i=0;i<peopleCount;i++) {
            int ages = (int) ((Math.random()*maxAge)+1);
            People person = new People();
            person.setAge(ages);
            localIslanders.add(person);
        }
        return localIslanders;
    }
    /*** Skaiciuojam salos populiacija ***/
    static int howManyPeople() {
        int count = 0;
        for (int i=0;i<localIslanders.size();i++) {
            count++;
        }
        return count;
    }
}
