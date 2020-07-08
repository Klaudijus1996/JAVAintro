package _6_pask_NamuDarbas;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Darbuotojas> companyStaff = new ArrayList<>();

    public static void main(String[] args) {

        Calc.generateContent();
        Calc.addNameAgeSalary();
        Calc.addCity();
        Collections.sort(companyStaff, new Darbuotojas());
        Calc.writeToFile();
        for (int i = 0; i < companyStaff.size(); i++) {
            System.out.println(companyStaff.get(i).getName());
        }

    }
}
