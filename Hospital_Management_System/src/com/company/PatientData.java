package com.company;

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
}
