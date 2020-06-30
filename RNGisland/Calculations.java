package RNGisland;

import java.util.Random;

public class Calculations {
    /*** Kontroliuojam populiacija ***/
    static int newLife() {
        int age15to30 = 0,
                age31to50 = 0;
        Random Birth = new Random();
        Island.yearCount++;
        for (int i=0;i<Island.localIslanders.size();i++) {
            double chance = Birth.nextDouble();
            int personsAge = Island.localIslanders.get(i).getAge();
            int birthControl = Island.localIslanders.get(i).getBirthControl();
            if ( personsAge >= 15 && personsAge <= 30 && birthControl == 0 && chance < 0.1) {
                age15to30++;
                People newBorn = new People();
                newBorn.setAge(-1);
                Island.localIslanders.add(newBorn);
                Island.localIslanders.get(i).setBirthControl(3);
            }
            if ( personsAge > 30 && personsAge <= 50 && birthControl == 0 && chance < 0.05) {
                age31to50++;
                People newBorn = new People();
                newBorn.setAge(-1);
                Island.localIslanders.add(newBorn);
                Island.localIslanders.get(i).setBirthControl(4);
            }
        }
        for (int i=0;i<Island.localIslanders.size();i++) {
            int birthControl = Island.localIslanders.get(i).getBirthControl();
            if (birthControl > 0) {
                Island.localIslanders.get(i).setBirthControl(birthControl-1);
            }
        }
        System.out.println("Kiek gime zmogeliuku: "+(age15to30+age31to50));
        return age15to30+age31to50;
    }
    /*** Pravalom populiacija ***/
    static int deaths(int year) {
        int count0to10 = 0,
            count11to20 = 0,
            count21to50 = 0,
            count50plus = 0;
        Random Deaths = new Random();
        for (int i=0;i<Island.localIslanders.size();i++) {
            double chance = Deaths.nextDouble();
            int personsAge = Island.localIslanders.get(i).getAge();
            if ( personsAge <= 10 && chance < 0.05 ) {
                count0to10++;
                Island.localIslanders.remove(Island.localIslanders.get(i));
            } else
            if ( personsAge >=11 && personsAge <= 20 && chance < 0.02) {
                count11to20++;
                Island.localIslanders.remove(Island.localIslanders.get(i));
            } else
            if ( personsAge >=21 && personsAge <= 50 && chance < 0.05) {
                count21to50++;
                Island.localIslanders.remove(Island.localIslanders.get(i));
            } else
            if ( personsAge > 50 && chance < 0.1 + (0.02*year)) {
                count50plus++;
                Island.localIslanders.remove(Island.localIslanders.get(i));
            } else
            if (personsAge >= 120) {
                Island.localIslanders.remove(Island.localIslanders.get(i));
            }
        }
        for (int i = 0; i < Island.localIslanders.size(); i++) {
            Island.localIslanders.get(i).setAge(Island.localIslanders.get(i).getAge()+1);
        }
        System.out.println("Kiek mire zmogeliuku: "+(count0to10+count11to20+count21to50+count50plus));
        return count0to10+count11to20+count21to50+count50plus;
    }
}
