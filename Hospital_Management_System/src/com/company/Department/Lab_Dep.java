package com.company.Department;

class Lab extends DepartmentData {
    public Lab() {
        super("Lab");
    }
    public void dep_info() {
        System.out.println("Tests are carried out to obtain info about the patient's health to aid in diagnosis, treatment or prevention of disease");
    }
    public void Services_available() {
        System.out.println("Facilities Of lab:\n1.Blood Testing (Complete Blood Picture)\n2.Cholesterol level testing\n3.Liver fat testing\n4.Examination of blood sugar etc");
    }
    public String getPatientFilePath() {
        return "Lab_Patients.txt";
    }
}