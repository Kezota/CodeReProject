package com.company.Entity;

import java.util.Scanner;

import com.company.Department.DepartmentData;
import com.company.Department.DepartmentFactory;
import com.company.util.FIleUtil;

public class Patient {

    private PatientData patients = new PatientData();

    public void ADD_Patient() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name:");
        patients.setName(input.nextLine());

        System.out.println("Enter Patient's Relative Name:");
        patients.setRelative(input.nextLine());

        System.out.println("Enter Age:");
        patients.setAge(input.nextInt());
        input.nextLine();

        System.out.println("Gender (F/M):");
        patients.setGender(input.next().charAt(0));
        input.nextLine();

        System.out.println("Problem/Disease:");
        patients.setDisease(input.nextLine());

        System.out.println("Refer To Department:");
        System.out.println("1. Cardiology");
        System.out.println("2. Neurology");
        System.out.println("3. Eye");
        System.out.println("4. Dental");
        System.out.println("5. Lab");

        int deptOption = input.nextInt();
        input.nextLine();

        DepartmentData dept = DepartmentFactory.getDepartmentByOption(deptOption);

        if (dept != null) {
            patients.setDepartment(dept.getDepartmentName());
            FIleUtil.writeToFile(dept.getPatientFilePath(), patients.toReportString());
        } else {
            System.out.println("Invalid department selection.");
        }

        input.close();
    }
}
