package _4_pask_namuDarbai;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Main {
    static ArrayList<Staff> Employee = new ArrayList<>();
    public static void main(String[] args) {
        String StaffDataFile = "src/_4_pask_namuDarbai/StaffData.txt";
        File staffData = new File(StaffDataFile);

        try {
            FileReader readStaffFile = new FileReader(staffData);
            BufferedReader bufferedReader = new BufferedReader(readStaffFile);
            String fileLine = bufferedReader.readLine();
            while(fileLine != null) {
                String[] strSplit = fileLine.split(", ");
                Employee.add(new Staff(strSplit[0],Integer.parseInt(strSplit[1]),Integer.parseInt(strSplit[2])));
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File was not found!!");
        } catch (IOException e) {
            System.out.println("Some general IO error");
        }

        /*** calling calculations (printStaff == optional) ***/
//        printStaff(Employee);
        System.out.println("Staff average age: "+Calculations.countAverageAgeOfStaff(Employee));
        System.out.println("Seniors average salary: "+Calculations.calculateSalaryOfSeniors(Employee));

        /** INPUT DATA **/

        String InputStaffData = "src/_4_pask_namuDarbai/inputData.txt";
        File inputStaff = new File(InputStaffData);
        String lineSep = System.getProperty("line.separator");
        String s = System.lineSeparator() + "New Line!";
        Path p = Paths.get(InputStaffData);
        try {
            FileWriter staffInput = new FileWriter(InputStaffData);
            for (int i = 0; i < Main.Employee.size(); i++) {
                Staff getter = Main.Employee.get(i);
                staffInput.write((getter.getName()+", "+getter.getSalary()+", "+getter.getAge())+lineSep);
            }
            staffInput.close();
            System.out.println("Success!!");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
            try {
                Files.write(p, "www.uFocknWotM8?.org".getBytes(), StandardOpenOption.APPEND);
                System.out.println("Pavyko? ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    static void printStaff(ArrayList<Staff> staff) {
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
        }
    }
}
