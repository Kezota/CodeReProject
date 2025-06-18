package com.company.Entity;
import java.util.Scanner;

import com.company.Department.DepartmentData;
import com.company.Department.DepartmentFactory;
import com.company.util.FIleUtil;

public class ADD_Doctor {
    DoctorsData doctors = new DoctorsData();
    Scanner input=new Scanner(System.in);
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
        int deptOption = input.nextInt();
        input.nextLine();
        DepartmentData dept = DepartmentFactory.getDepartmentByOption(deptOption);

        if (dept != null) {
            doctors.setDepartment(dept.getDepartmentName());
            FIleUtil.writeToFile(dept.getPatientFilePath(), doctors.toReportString());
        } else {
            System.out.println("Invalid department selection.");
        }
        
    }
}
