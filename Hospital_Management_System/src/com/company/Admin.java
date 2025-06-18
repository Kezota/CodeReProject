package com.company;
import java.util.Scanner;
public class Admin {
    Patient p=new Patient();
    ADD_Doctor d=new ADD_Doctor();
    view_Doctor v=new view_Doctor();
    view_Patients x=new view_Patients();
    
    public void viewUI(){
        System.out.println("--------------------------");
        System.out.println("1.Add New Patient\n2.View Patient List\n3.Add New Doctors\n4.View Doctors List");
        System.out.println("--------------------------");
        System.out.println("Enter From 1,2,3or,4");
    }

    private void handleOption(int option) {
        switch (option) {
            case 1 -> p.ADD_Patient();
            case 2 -> x.ViewPatient();
            case 3 -> d.Bio_Data();
            case 4 -> v.display();
            default -> System.out.println("Invalid option. Please choose 1 to 4.");
        }
    }

    public void choose(){
        int c;
        char i;
        Scanner input=new Scanner(System.in);
        do {
            viewUI();
            c=input.nextInt();
            handleOption(c);
            System.out.println("Do you want to run it again?(Y/N)");
            i=input.next().charAt(0);
        }while(i=='Y'||i=='y');
        input.close();
    }
}
