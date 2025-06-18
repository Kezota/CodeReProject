package com.company;

public class DoctorsData extends Person{
    private String Special,workingHours;
    private double CNIC;
    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String special) {
        this.Special = special;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public double getCNIC() {
        return CNIC;
    }

    public void setCNIC(double CNIC) {
        this.CNIC = CNIC;
    }
}
