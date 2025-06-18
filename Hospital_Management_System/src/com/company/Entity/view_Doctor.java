package com.company.Entity;

import java.util.Scanner;
import com.company.util.FIleUtil;

public class view_Doctor {

    Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("View Doctor list of:");
        System.out.println("1. Cardiology");
        System.out.println("2. Neurology");
        System.out.println("3. Eye");
        System.out.println("4. Dental");
        System.out.println("5. Lab");

        int a = input.nextInt();

        switch (a) {
            case 1:
                FIleUtil.getFromFile("Heart_Specialist.txt");
                break;
            case 2:
                FIleUtil.getFromFile("Brain_Specialist.txt");
                break;
            case 3:
                FIleUtil.getFromFile("Eye_Specialist.txt");
                break;
            case 4:
                FIleUtil.getFromFile("Dental_Specialist.txt");
                break;
            case 5:
                FIleUtil.getFromFile("Lab_Specialist.txt");
                break;
            default:
                System.out.println("Enter a valid option (1 to 5).");
                break;
        }
    }
}
