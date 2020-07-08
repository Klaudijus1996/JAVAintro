package _6_pask_NamuDarbas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calc {
    public static void generateContent() {
        int staffCount = (int)(Math.random()*99+51);
        for (int i = 0; i < staffCount; i++) {
            Main.companyStaff.add(new Darbuotojas());
        }
    }
    public static void addNameAgeSalary() {
        String[] names = {"Jack", "Connor",	"Liam",	"John",
                "Harry", "Callum", "Mason",	"Robert",
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
                "Sophie", "Tracy", "Charlotte", "Sarah"};
        for (int i = 0; i < Main.companyStaff.size(); i++) {
            int salary = (int)(Math.random()*2499+1001);
            int age = (int)(Math.random()*49+21);
            Darbuotojas getStaff = Main.companyStaff.get(i);
            getStaff.setAge(age);
            getStaff.setSalary(salary);
            for (int j = 0; j < names.length; j++) {
                int randomIdex = (int)(Math.random()*j);
                Main.companyStaff.get(i).setName(names[randomIdex]);
            }
        }
    }
    public static void addCity() {
        String[] Cities = {"Kaunas", "Vilnius", "Klaipeda", "Panevezys"};
        for (int i = 0; i < Main.companyStaff.size(); i++) {
            for (int j = 0; j < Cities.length; j++) {
                int randomIndex = (int)(Math.random()*(j+1));
                Main.companyStaff.get(i).setCity(Cities[randomIndex]);
            }
        }
    }
    public static void writeToFile() {
        String newLine = "\n";
        String path = "src/_6_pask_NamuDarbas/Staff.csv";
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < Main.companyStaff.size(); i++) {
                Darbuotojas staff = Main.companyStaff.get(i);
                bufferedWriter.write(staff.getCity()+", "+staff.getName()+", "+staff.getAge()+", "+staff.getSalary()+newLine);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
