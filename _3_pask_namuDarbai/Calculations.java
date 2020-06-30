package _3_pask_namuDarbai;

import java.util.ArrayList;

public class Calculations {
    static void printData() {
        for (int i = 0; i < WorkPlace.employees.size() ; i++) {
            Employees getter = WorkPlace.employees.get(i);
            System.out.println(getter.getName()+", "+getter.getAge()+", "+getter.getSalary());
        }
    }
    static ArrayList<Employees> generateContent() {
        String[] names = {"Jack", "Connor",	"Liam",	"John", "Harry", "Callum", "Mason",	"Robert",
                "Jacob", "Jacob", "Jacob", "Michael",
                "Charlie", "Kyle", "William", "William",
                "Thomas", "Joe", "Ethan", "David",
                "George", "Reece", "Michael", "Richard",
                "Oscar", "Rhys", "Alexander", "Joseph",
                "James", "Charlie", "James", "Charles",
                "William", "Damian", "Daniel", "Thomas",
                "Amelia", "Margaret", "Emma", "Mary",
                "Olivia", "Samantha", "Olivia", "Patricia",
                "Isla", "Bethany", "Sophia", "Jennifer",
                "Emily", "Elizabeth", "Isabella", "Elizabeth",
                "Poppy", "Joanne", "Ava", "Linda",
                "Ava", "Megan", "Mia", "Barbara",
                "Isabella", "Victoria", "Emily", "Susan",
                "Jessica", "Lauren", "Abigail", "Margaret",
                "Lily", "Michelle", "Madison", "Jessica",
                "Sophie", "Tracy", "Charlotte", "Sarah",};
        for (int i = 0; i < WorkPlace.employeesCount ; i++) {
            Employees employee = new Employees();
            employee.setName(names[i]);
            employee.setAge((int)(Math.random()*49+21));
            employee.setSalary((int)(Math.random()*1699+700));
            WorkPlace.employees.add(employee);
        }
        return WorkPlace.employees;
    }
    static int ageAverage() {
        int averageAge = 0,
            averageSalary = 0,
            countStaff = 0;
        for (int i = 0; i < WorkPlace.employees.size(); i++) {
            Employees getIndex = WorkPlace.employees.get(i);
            int getAge = WorkPlace.employees.get(i).getAge();
            if (getIndex.getAge() <= 50) {
                getIndex.setSalary((int)(Math.random()*1699+700));
                averageSalary += WorkPlace.employees.get(i).getSalary();
                countStaff++;
            } else { getIndex.setSalary((int)(Math.random()*2499+1501)); }
            averageAge += getAge;
        }
        System.out.println("Employees count: "+ WorkPlace.employees.size());
        System.out.println("Junior && Mid dev count: "+countStaff);
        System.out.println("Junior && Mid dev average salary: "+(averageSalary / countStaff));
        return averageAge / WorkPlace.employees.size();
    }
    static int averageAboveAge50() {
        int averageAge = 0,
            seniorCount = 0,
            averageSalary = 0;

        for (int i = 0; i < WorkPlace.employees.size(); i++) {
            int getAge = WorkPlace.employees.get(i).getAge(),
                getSalary = WorkPlace.employees.get(i).getSalary();
            if (getAge > 50) {
                averageAge += getAge;
                averageSalary += getSalary;
                seniorCount++;
            }
        }

        System.out.println("Seniors count: "+seniorCount);
        System.out.println("Average senior salary: "+(averageSalary / seniorCount));
        return averageAge / seniorCount;
    }
}
