package com.company.Pharmacy;

public class Cardiac_med extends ADD_Medicine {
    @Override
    public void add() {
        addMedicineToFile("Cardiac_Medicines.txt");
    }
}
