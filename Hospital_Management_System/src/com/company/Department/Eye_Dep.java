package com.company.Department;

class Eye_Dep extends DepartmentData {
    public Eye_Dep() {
        super("Eye");
    }
    public void dep_info() {
        System.out.println("Ophthalmology deals with diagnosis and treatment of eye disorders");
    }
    public void Services_available() {
        System.out.println("Tests For eye available:\n1.Eye examination\n2.OCT scans\n3.Eyesight check\n4.Ultrasonography of eye\n5.Eye surgery");
    }
    public String getPatientFilePath() {
        return "Eye_Patients.txt";
    }
}