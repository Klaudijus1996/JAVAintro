package _3_pask_namuDarbai;

import java.util.ArrayList;

public class WorkPlace {
    static int employeesCount = (int)(Math.random()*69+1);
    static ArrayList<Employees> employees = new ArrayList<>();

    public static void main(String[] args) {
        //TODO type your code;
        System.out.println(Calculations.generateContent());
        System.out.println("Average age of a work place: "+Calculations.ageAverage());
        System.out.println("Average age of Senior dev's: "+Calculations.averageAboveAge50());
        Calculations.printData();
    }
}
/** personalo statistika:
 susikurti darbuotoju klase su vardais ir amzium:
 -- turime klase darbuotojas - implementuojame enkapsuliacija
 -- sukurkite darbuotoju kolekcija ArrList;
 -- apskaiciuokite amziaus vidurki
 -- atskirai apskaiciuokite vidurki zmoniu, kurie vyresni nei 50 metu; **/

