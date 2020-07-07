package _5_pask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Darbuotojas> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        Calculations.generateObj();
        System.out.println("Before sort: "+staffMembers);
        Calculations.addCity();
        System.out.println("Yay --> " + staffMembers);
        Collections.sort(staffMembers);
        System.out.println("After sort: "+staffMembers);
        Calculations.writeToFile();
    }
}
