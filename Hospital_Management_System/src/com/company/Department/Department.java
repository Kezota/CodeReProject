package com.company.Department;

import java.util.Scanner;

class Dep {
    Scanner input = new Scanner(System.in);

    public void Dep_Display() {
        int choice;

        do {
            System.out.println("Departments:");
            System.out.println("1. Cardiology");
            System.out.println("2. Neurology");
            System.out.println("3. Eye");
            System.out.println("4. Dental");
            System.out.println("5. Lab");

            System.out.print("Select Department: ");
            int option = input.nextInt();

            DepartmentData dept = DepartmentFactory.getDepartmentByOption(option);

            if (dept != null) {
                dept.dep_info();
                dept.Services_available();
            } else {
                System.out.println("Invalid option.");
            }

            System.out.println("See another department? Press 1");
            choice = input.nextInt();

        } while (choice == 1);
    }
}