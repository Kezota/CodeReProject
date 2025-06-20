package com.company.Admin;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

import com.company.Entity.ADD_Doctor;
import com.company.Entity.Patient;
import com.company.Entity.view_Doctor;
import com.company.Entity.view_Patients;

public class Admin {
    private Patient p = new Patient();
    private ADD_Doctor d = new ADD_Doctor();
    private view_Doctor v = new view_Doctor();
    private view_Patients x = new view_Patients();

    public void viewUI() {
        System.out.println("--------------------------");
        System.out.println("1. Add New Patient");
        System.out.println("2. View Patient List");
        System.out.println("3. Add New Doctors");
        System.out.println("4. View Doctors List");
        System.out.println("--------------------------");
        System.out.println("Enter a number from 1 to 4:");
    }

    private void handleOption(int option) {
        Map<Integer, Runnable> actions = new HashMap<>();
        actions.put(1, () -> p.ADD_Patient());
        actions.put(2, () -> x.ViewPatient());
        actions.put(3, () -> d.Bio_Data());
        actions.put(4, () -> v.display());

        Runnable action = actions.get(option);
        if (action != null) {
            action.run();
        } else {
            System.out.println("Invalid option. Please choose 1 to 4.");
        }
    }

    public void choose() {
        Scanner input = new Scanner(System.in);
        String i;

        do {
            viewUI();
            int c = input.nextInt();
            input.nextLine();
            handleOption(c);

            System.out.println("Do you want to run it again? (Y/N)");
            i = input.nextLine();
        } while (i.charAt(0) == 'Y' || i.charAt(0) == 'y');

        input.close();
    }
}
