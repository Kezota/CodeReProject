package com.company.Admin;
import java.util.Scanner;

import com.company.Entity.ADD_Doctor;
import com.company.Entity.Patient;
import com.company.Entity.view_Doctor;
import com.company.Entity.view_Patients;
public class Admin {
    private Patient p=new Patient();
    private ADD_Doctor d=new ADD_Doctor();
    private view_Doctor v=new view_Doctor();
    private view_Patients x=new view_Patients();
    
    public void viewUI(){
        System.out.println("--------------------------");
        System.out.println("1.Add New Patient\n2.View Patient List\n3.Add New Doctors\n4.View Doctors List");
        System.out.println("--------------------------");
        System.out.println("Enter From 1,2,3or,4");
    }

    private void handleOption(int option) {
        switch (option) {
            case 1 : 
                p.ADD_Patient();
                break;
            case 2 : 
                x.ViewPatient();
                break;
            case 3 :
                d.Bio_Data();
                break;
            case 4 : 
                v.display();
                break;
            default : 
                System.out.println("Invalid option. Please choose 1 to 4.");
                break;
        }
    }

    public void choose(){
        int c;
        String i;
        Scanner input=new Scanner(System.in);
        do {
            viewUI();
            c=input.nextInt();
            input.nextLine();
            handleOption(c);
            System.out.println("Do you want to run it again?(Y/N)");
            i=input.nextLine();
            System.out.println(i);
        }while(i.charAt(0)=='Y'||i.charAt(0)=='y');
        input.close();
    }
}
