package com.company.Department;

public class Dentistry_Dep extends DepartmentData {

    public Dentistry_Dep() {
        super("Dentistry");
    }

    public void dep_info() {
        System.out.println("Deals with the diagnosis, disorders, prevention and treatment of diseases of the oral cavity.");
    }

    public void Services_available() {
        System.out.println("Treatments available are:");
        System.out.println("1. Braces");
        System.out.println("2. Tooth implant");
        System.out.println("3. Bridge of teeth");
        System.out.println("4. Tooth extraction");
        System.out.println("5. Filling");
        System.out.println("6. Scaling and root planing");
    }

    public String getPatientFilePath() {
        return "Dental_Patients.txt";
    }
}
