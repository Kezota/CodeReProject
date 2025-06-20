package com.company.Department;

class Lab extends DepartmentData {

    public Lab() {
        super("Lab");
    }

    public void dep_info() {
        System.out.println("Tests are carried out to obtain information about the patient's health to aid in diagnosis, treatment, or prevention of disease.");
    }

    public void Services_available() {
        System.out.println("Facilities of the lab:");
        System.out.println("1. Blood Testing (Complete Blood Picture)");
        System.out.println("2. Cholesterol level testing");
        System.out.println("3. Liver fat testing");
        System.out.println("4. Examination of blood sugar, etc.");
    }

    public String getPatientFilePath() {
        return "Lab_Patients.txt";
    }
}
