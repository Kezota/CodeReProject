package com.company.Department;

class Neurology_Dep extends DepartmentData {

    public Neurology_Dep() {
        super("Neurology");
    }

    public void dep_info() {
        System.out.println("Deals with the study and treatment of disorders of the nervous system.");
        System.out.println("Diagnosis and treatment of all categories of diseases involving the central and peripheral nervous system.");
    }

    public void Services_available() {
        System.out.println("Facilities available are:");
        System.out.println("1. Computed Axial Tomography (CT) scans");
        System.out.println("2. Magnetic Source Imaging (MRI)");
        System.out.println("3. Ultrasound of major blood vessels of the head and neck");
    }

    public String getPatientFilePath() {
        return "Brain_Patients.txt";
    }
}
