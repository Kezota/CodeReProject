package com.company.Entity;

import java.util.Scanner;

import com.company.util.FIleUtil;

public class view_Doctor{
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