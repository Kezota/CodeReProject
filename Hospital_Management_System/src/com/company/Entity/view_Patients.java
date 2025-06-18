package com.company.Entity;

import java.util.Scanner;
import com.company.util.FIleUtil;

public class view_Patients {

    Scanner input = new Scanner(System.in);

    public void ViewPatient() {
        System.out.println("View Patient list of:");
        System.out.println("1. Cardiology");
        System.out.println("2. Neurology");
        System.out.println("3. Eye");
        System.out.println("4. Dental");
        System.out.println("5. Lab");

        int s = input.nextInt();

        switch (s) {
            case 1:
                FIleUtil.getFromFile("Heart_Patients.txt");
                break;
            case 2:
                FIleUtil.getFromFile("Brain_Patients.txt");
                break;
            case 3:
                FIleUtil.getFromFile("Eye_Patients.txt");
                break;
            case 4:
                FIleUtil.getFromFile("Dental_Patients.txt");
                break;
            case 5:
                FIleUtil.getFromFile("Lab_Patients.txt");
                break;
            default:
                System.out.println("Enter a valid option (1 to 5).");
                break;
        }
    }
}
