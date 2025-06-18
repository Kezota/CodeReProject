package com.company.Pharmacy;

public class Eye_med extends ADD_Medicine {
    @Override
    public void add() {
        addMedicineToFile("Eye_Medicines.txt");
    }
}
