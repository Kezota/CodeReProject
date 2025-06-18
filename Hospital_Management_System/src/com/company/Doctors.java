package com.company;
import java.util.Scanner;

class ADD_Doctor {
    DoctorsData doctors = new DoctorsData();
    Scanner input=new Scanner(System.in);
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
class view_Doctor{
    Scanner input=new Scanner(System.in);
    public void display(){
        int a;
        System.out.println("View Doctor list of:\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        a=input.nextInt();
        switch (a) {
            case 1: {
                FIleUtil.getFromFile("Heart_Specialist.txt");
                break;
            }
            case 2: {
                FIleUtil.getFromFile("Brain_Specialist.txt");
                break;
            }
            case 3: {
                FIleUtil.getFromFile("Eye_Specialist.txt");
                break;
            }
            case 4: {
                FIleUtil.getFromFile("Dental_Specialist.txt");
                break;
            }
            case 5: {
                FIleUtil.getFromFile("Lab_Specialist.txt");
                break;
            }
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }
}