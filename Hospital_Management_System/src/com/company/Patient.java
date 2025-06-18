package com.company;
import java.util.Scanner;
public class Patient {
    private PatientData patients = new PatientData();
    public void ADD_Patient(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Name:");
        patients.setName("Name " +input.nextLine());
        input.nextLine();
        
        System.out.println("Enter Patient's Relative Name:");
        patients.setRelative("Relative's Name " + input.nextLine());
        
        System.out.println("Enter Age:");
        patients.setAge(input.nextInt());
        input.nextLine();
        
        System.out.println("Gender (F/M):");
        patients.setGender(input.next().charAt(0));
        input.nextLine();
        
        System.out.println("Problem/Disease");
        patients.setDisease(input.nextLine());
        
        int dep = 0;
        System.out.println("Refer To Department\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        dep = input.nextInt();
        String res = "Name " + patients.getName();
        res += "Relative's Name " + patients.getRelative();
        res += "\nGender: " + patients.getGender();
        res += "\nDisease: " + patients.getDisease();
        switch (dep){
            case 1:
                res += "Department: Cardiology";
                FIleUtil.writeToFile("Heart_Patients.txt", res);
                break;
            case 2:
                res += "Department: Neurology";
                FIleUtil.writeToFile("Brain_Patients.txt", res);
                break;
            case 3:
                res += "Department: Eye";
                FIleUtil.writeToFile("Eye_Patients.txt", res);
                break;
            case 4:
                res += "Department: Dental";
                FIleUtil.writeToFile("Dental_Patients.txt", res);
                break;
            case 5:
                res += "Department: Lab";
                FIleUtil.writeToFile("Lab_Patients.txt", res);
                break;
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
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