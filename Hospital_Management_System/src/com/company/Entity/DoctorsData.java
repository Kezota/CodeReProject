package com.company.Entity;

public class DoctorsData extends Person {
    private String special;
    private String workingHours;
    private double cnic;

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public double getCNIC() {
        return cnic;
    }

    public void setCNIC(double cnic) {
        this.cnic = cnic;
    }

    @Override
    public String toReportString() {
        return "Name: " + this.getName() +
                "\nCNIC: " + this.getCNIC() +
                "\nAge: " + this.getAge() +
                "\nGender: " + this.getGender() +
                "\nWorking Hours: " + this.getWorkingHours() +
                "\nSpecialization: " + this.getSpecial() +
                "\nDepartment: " + this.getDepartment() +
                "\n";
    }
}
