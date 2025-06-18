package com.company.Entity;

public class PatientData extends Person{
    private String Disease,Relative;
    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        this.Disease = disease;
    }
    public String getRelative() {
        return Relative;
    }

    public void setRelative(String relative) {
        this.Relative = relative;
    }
    @Override
    public String toReportString() {
        return "Name: " + this.getName() +
            "\nRelative's Name: " + this.getRelative() +
            "\nAge: " + this.getAge() +
            "\nGender: " + this.getGender() +
            "\nDisease: " + this.getDisease() + 
            "\n Department" + this.getDepartment() +
            "\n";
    }
}
