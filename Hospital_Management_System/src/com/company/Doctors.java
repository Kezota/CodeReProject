package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Doctors {
    public ArrayList<String> Doctor=new ArrayList<String>();
    public abstract void Bio_Data();
}
class ADD_Doctor extends Doctors{
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
        
        

        String res = "Name:\t" + doctors.getName();
        res += "CNIC:\t" + doctors.getCNIC();
        res += "Age:\t" + doctors.getAge();
        res += "Gender:\t" + doctors.getAge();
        res += "Working Hours:\t" + doctors.getWorkingHours();
        res += "Specialization in:\t"+doctors.getSpecial();
        int dep;
        System.out.println("Hired in department:\t");
        System.out.println("1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        dep=input.nextInt();
        
        switch (dep) {
            case 1:
                res += "Department: Cardiology";
                FIleUtil.writeToFile("Heart_Specialist.txt", res);
                break;
            case 2:
                res += "Department: Neurology";
                FIleUtil.writeToFile("Brain_Specialist.txt", res);
                break;
            case 3:
                res += "Department: Eye";
                FIleUtil.writeToFile("Eye_Specialist.txt", res);
                break;
            case 4:
                res += "Department: Dental";
                FIleUtil.writeToFile("Dental_Specialist.txt", res);
                break;
            case 5:
                res += "Department: Lab";
                FIleUtil.writeToFile("Lab_Specialist.txt", res);
                break;
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
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