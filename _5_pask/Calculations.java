package _5_pask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Calculations {
    static ArrayList<Darbuotojas> generateObj() {
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
        int staff = (int)(Math.random()*55+21);
        for (int i = 0; i < staff; i++) {
            int age = (int)(Math.random()*49+21);
            int salary = (int)(Math.random()*2000+1000);
            Main.staffMembers.add(new Darbuotojas(names[i],age,salary));
        }
        return Main.staffMembers;
    }
    static void addCity() {
        String[] Cities = {"Kaunas", "Vilnius", "Klaipeda", "Panevezys"};
        for (int i = 0; i < Main.staffMembers.size(); i++) {
            for (int j = 0; j < Cities.length; j++) {
                int randomIndex = (int)(Math.random()*(j+1));
                Main.staffMembers.get(i).setCity(Cities[randomIndex]);
            }
            System.out.println("City: "+Main.staffMembers.get(i).getCity());
        }
    }
    static void writeToFile() {
        File companyStaff = new File("src/_5_pask/namuDarbas/CompanyStaff.csv");
        String newLine = System.getProperty("line.separator");
        try {
            FileWriter fileWriter = new FileWriter(companyStaff);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < Main.staffMembers.size(); i++) {
                Darbuotojas getStaff = Main.staffMembers.get(i);
                bufferedWriter.write(getStaff.getCity()+", "+getStaff.getName()+", "+getStaff.getAge()+", "+getStaff.getSalary()+newLine);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
