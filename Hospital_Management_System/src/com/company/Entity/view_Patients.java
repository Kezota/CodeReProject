package com.company.Entity;

import java.util.Scanner;

import com.company.util.FIleUtil;

public class view_Patients{
    Scanner input=new Scanner(System.in);
    public void ViewPatient(){
        int s;
        System.out.println("View Patient list of:\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
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