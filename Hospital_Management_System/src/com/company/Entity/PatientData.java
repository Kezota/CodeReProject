package com.company.Entity;

public class PatientData extends Person {

    private String disease;
    private String relative;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getRelative() {
        return relative;
    }

    public void setRelative(String relative) {
        this.relative = relative;
    }

    @Override
    public String toReportString() {
        return "Name: " + this.getName() +
                "\nRelative's Name: " + this.getRelative() +
                "\nAge: " + this.getAge() +
                "\nGender: " + this.getGender() +
                "\nDisease: " + this.getDisease() +
                "\nDepartment: " + this.getDepartment() +
                "\n";
    }
}
