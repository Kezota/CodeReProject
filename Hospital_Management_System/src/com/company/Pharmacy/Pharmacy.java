package com.company.Pharmacy;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.util.FIleUtil;

import java.io.File;
public class Pharmacy {
    public void display(){
        int c,a,n;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("*******  PHARMACY  *********");
        System.out.println("1.Add New Medicine\t2.Search Medicine List\nEnter Option:\t");
        c=input.nextInt();
        Cardiac_med cardiac=new Cardiac_med();
        Neurology_med neuro=new Neurology_med();
        Eye_med e=new Eye_med();
        Dental_med den=new Dental_med();
        search_med h=new search_med();
        switch(c){
            case 1:{
                System.out.println("Add Medicinal Drug In:\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental");
                a=input.nextInt();
                switch (a){
                    case 1:
                        cardiac.add();
                    break;
                    case 2:
                        neuro.add();
                    break;
                    case 3:
                       e.add();
                    break;
                    case 4:
                        den.add();
                    break;
                }
            break;}
            case 2:{
                System.out.println("View/Search Medicines of:\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental");
                a=input.nextInt();
                switch (a){
                    case 1:
                        h.search_heart();
                    break;
                    case 2:
                        h.search_Brain_Med();
                    break;
                    case 3:
                        h.search_Eye_Med();
                    break;
                    case 4:
                        h.search_Dental_Med();
                    break;
                }
            break;}
        }System.out.println("To Exit Pharmacy press 0");
        n=input.nextInt();
        }while(n!=0);
        input.close();
    }
}
abstract class ADD_Medicine extends Pharmacy{
    private String med_name,exp_date,used_for;
    private float cost;
    public String getMed_name() {
        return med_name;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getUsed_for() {
        return used_for;
    }

    public void setUsed_for(String used_for) {
        this.used_for = used_for;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getReport() {
        return getMed_name() + "\t" + getCost() + "\t\t" + getExp_date() + "\t" + getUsed_for() + "\n";
    }
    
    public void addMedicineToFile(String fileName) {
        Scanner input = new Scanner(System.in);

        // Get common inputs
        System.out.println("Enter Medicine Name:");
        setMed_name(input.next());

        System.out.println("Cost:");
        setCost(input.nextFloat());

        System.out.println("Expiry Date:");
        setExp_date(input.next());

        System.out.println("Used for curing:");
        setUsed_for(input.next());

        try{
            FIleUtil.writeToFile(fileName, getReport());
            System.out.println("Written");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        input.close();
    }
    public abstract void add();
}
class Cardiac_med extends ADD_Medicine{

    @Override
    public void add() {
        addMedicineToFile("Cardiac_Medicines.txt");
        
    }

}
class Neurology_med extends ADD_Medicine{
    @Override
    public void add() {
        addMedicineToFile("Brain_Medicines.txt");
    }
}
class Eye_med extends ADD_Medicine{
    @Override
    public void add() {
        addMedicineToFile("Eye_Medicines.txt");
    }
}
class Dental_med extends ADD_Medicine{
    @Override
    public void add() {
        addMedicineToFile("Dental_Medicines.txt");
    }

}
class search_med extends Pharmacy{
    ArrayList<String> Med=new ArrayList<String>();
    ArrayList<String> Neuro=new ArrayList<String>();
    ArrayList<String> Eye=new ArrayList<String>();
    ArrayList<String> Dental=new ArrayList<String>();
    public void search_heart(){
        try {
            File myObj=new File("Cardiac_Medicines.txt");
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void search_Brain_Med(){
        try {
            File myObj=new File("Brain_Medicines.txt");
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void search_Eye_Med(){
        try {
            File myObj=new File("Eye_Medicines.txt");
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void search_Dental_Med(){
        try {
            File myObj=new File("Dental_Medicines.txt");
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}