package com.company.Pharmacy;

public class Dental_med extends ADD_Medicine {
    @Override
    public void add() {
        addMedicineToFile("Dental_Medicines.txt");
    }
}
