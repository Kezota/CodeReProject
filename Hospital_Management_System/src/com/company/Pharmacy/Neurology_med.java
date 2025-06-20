package com.company.Pharmacy;

public class Neurology_med extends ADD_Medicine {
    @Override
    public void add() {
        addMedicineToFile("Brain_Medicines.txt");
    }
}
