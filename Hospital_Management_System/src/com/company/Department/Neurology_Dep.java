package com.company.Department;

class Neurology_Dep extends DepartmentData{
    public Neurology_Dep() {
        super("Neuorology");
    }
    public void dep_info() {
        System.out.println("Deals with the study and Treatment of disorders of the nervous system");
        System.out.println("Diagnosis and treatment of all categories of disease involving central and peripheral nervous system");
    }
    public void Services_available() {
        System.out.println("Facilities available are:\n1.Computed Axial Tomography scans\n2.Magnetic source imaging(MRI)\n3.Ultrasound of major blood vessels of head and neck");
    }
    public String getPatientFilePath() {
        return "Brain_Patients.txt";
    }
}