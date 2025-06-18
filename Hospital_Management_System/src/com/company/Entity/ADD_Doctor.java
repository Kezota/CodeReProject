package com.company.Entity;
import java.util.Scanner;

import com.company.util.FIleUtil;

public class ADD_Doctor {
    private DoctorsData doctors = new DoctorsData();
    private Scanner input=new Scanner(System.in);
    private void handleDepartment(int dep) {
        switch (dep) {
            case 1:
                doctors.setDepartment("Cardiology");
                FIleUtil.writeToFile("Heart_Patients.txt", doctors.toReportString());
                break;
            case 2:
                doctors.setDepartment("Neurology");
                FIleUtil.writeToFile("Brain_Patients.txt", doctors.toReportString());
                break;
            case 3:
                doctors.setDepartment("Eye");
                FIleUtil.writeToFile("Eye_Patients.txt", doctors.toReportString());
                break;
            case 4:
                doctors.setDepartment("Dental");
                FIleUtil.writeToFile("Dental_Patients.txt", doctors.toReportString());
                break;
            case 5:
                doctors.setDepartment("Lab");
                FIleUtil.writeToFile("Lab_Patients.txt", doctors.toReportString());
                break;
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }
    public void Bio_Data(){
        System.out.println("Enter Name:");
        doctors.setName(input.nextLine());
        
        System.out.println("Enter CNIC:");
        doctors.setCNIC(input.nextDouble());
        input.nextLine();
        
        System.out.println("Enter Age:");
        doctors.setAge(input.nextInt());
        
        System.out.println("Gender (F/M):");
        doctors.setGender(input.next().charAt(0));
        input.nextLine();

        System.out.println("Working Hours:");
        doctors.setWorkingHours(input.nextLine());
        
        System.out.println("Specialization in:\t");
        doctors.setSpecial(input.nextLine());
        int dep;
        System.out.println("Hired in department:\t");
        System.out.println("1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        dep=input.nextInt();
        handleDepartment(dep);
        
    }
}

