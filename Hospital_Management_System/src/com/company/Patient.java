package com.company;
import java.util.Scanner;
public class Patient {
    private PatientData patients = new PatientData();
    
    private void handleDepartment(int dep) {
        switch (dep) {
            case 1:
                patients.setDepartment("Cardiology");
                FIleUtil.writeToFile("Heart_Patients.txt", patients.toReportString());
                break;
            case 2:
                patients.setDepartment("Neurology");
                FIleUtil.writeToFile("Brain_Patients.txt", patients.toReportString());
                break;
            case 3:
                patients.setDepartment("Eye");
                FIleUtil.writeToFile("Eye_Patients.txt", patients.toReportString());
                break;
            case 4:
                patients.setDepartment("Dental");
                FIleUtil.writeToFile("Dental_Patients.txt", patients.toReportString());
                break;
            case 5:
                patients.setDepartment("Lab");
                FIleUtil.writeToFile("Lab_Patients.txt", patients.toReportString());
                break;
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }

    public void ADD_Patient(){
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
        System.out.println("Refer To Department\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        int dep = input.nextInt();
        handleDepartment(dep);
        input.close();
    }

}
class view_Patients{
    Scanner input=new Scanner(System.in);
    public void ViewPatient(){
        int s;
        System.out.println("View Patient list of:\t1.1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        s=input.nextInt();
        switch (s){
            case 1:{
                FIleUtil.getFromFile("Heart_Patients.txt");
                break;
            }
            case 2:{
                FIleUtil.getFromFile("Brain_Patients.txt");
                break;
            }
            case 3:{
                FIleUtil.getFromFile("Eye_Patients.txt");
                break;}
            case 4:{
                FIleUtil.getFromFile("Dental_Patients.txt");
                break;}
            case 5:{
                FIleUtil.getFromFile("Lab_Patients.txt");
                break;}
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }
}