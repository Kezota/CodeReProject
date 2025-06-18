package com.company.Department;

class Dentistry_Dep extends DepartmentData {
    public Dentistry_Dep() {
        super("Dentistry");
    }
    public void dep_info() {
        System.out.println("Deals with the diagnosis, disorders, prevention and treatment of diseases of oral cavity");
    }
    public void Services_available() {
        System.out.println("Treatments available are:\n1.Braces\n2.Tooth implant\n3.Bridge of teeth\n4.Tooth extraction\n5.Filling\n6.Scaling and root planting");
    }
    public String getPatientFilePath() {
        return "Dental_Patients.txt";
    }
}