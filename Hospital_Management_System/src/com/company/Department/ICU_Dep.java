package com.company.Department;

class ICU_Dep extends DepartmentData {
    public ICU_Dep() {
        super("ICU/CCU");
    }
    public void dep_info() {
        System.out.println("Special department in hospital that provides intensive care medicines");
        System.out.println("Patients with life threatening illness or injuries who require constant care and supervision and life support equipment");
    }
    public void Services_available() {
        System.out.println("ICU or CCU include very critical operations i.e.:\nVentilator (lung Support)\nHemodialysis (Renal support)\nIntra-Aortic (cardiac support)");
    }
    public String getPatientFilePath() {
        return "ICU_Patients.txt";
    }
}