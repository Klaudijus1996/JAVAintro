package _4_pask_namuDarbai;

import java.util.ArrayList;

public class Calculations {
    /** count average **/
    static int countAverageAgeOfStaff(ArrayList<Staff> staff) {
        int averageAge = 0;
        for (int i = 0; i < staff.size(); i++) {
            int getAge = staff.get(i).getAge();
            averageAge += getAge;
        }
        return averageAge/staff.size();
    }
    static int calculateSalaryOfSeniors(ArrayList<Staff> staff) {
        int averageSalary = 0;
        int seniorCount = 0;
        for (int i = 0; i < staff.size(); i++) {
            int getSalary = staff.get(i).getSalary();
            int getAge = staff.get(i).getAge();
            if (getAge > 50) {
                seniorCount++;
                averageSalary += getSalary;
            }
        }
        return averageSalary / seniorCount;
    }
}
