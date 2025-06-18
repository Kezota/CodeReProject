package com.company.Pharmacy;

import com.company.util.FIleUtil;

import java.util.Scanner;

abstract class ADD_Medicine extends Pharmacy {
    private String medName, expDate, usedFor;
    private float cost;

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getReport() {
        return getMedName() + "\t" + getCost() + "\t\t" + getExpDate() + "\t" + getUsedFor() + "\n";
    }

    public void addMedicineToFile(String fileName) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Medicine Name:");
        setMedName(input.next());

        System.out.println("Cost:");
        setCost(input.nextFloat());

        System.out.println("Expiry Date:");
        setExpDate(input.next());

        System.out.println("Used for curing:");
        setUsedFor(input.next());

        try {
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

