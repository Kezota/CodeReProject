package com.company.Department;

class Eye_Dep extends DepartmentData {

    public Eye_Dep() {
        super("Eye");
    }

    public void dep_info() {
        System.out.println("Ophthalmology deals with diagnosis and treatment of eye disorders.");
    }

    public void Services_available() {
        System.out.println("Tests for the eye available:");
        System.out.println("1. Eye examination");
        System.out.println("2. OCT scans");
        System.out.println("3. Eyesight check");
        System.out.println("4. Ultrasonography of eye");
        System.out.println("5. Eye surgery");
    }

    public String getPatientFilePath() {
        return "Eye_Patients.txt";
    }
}
