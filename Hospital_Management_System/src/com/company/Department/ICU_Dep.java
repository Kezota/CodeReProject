package com.company.Department;

class ICU_Dep extends DepartmentData {
    public ICU_Dep() {
        super("ICU/CCU");
    }

    public void dep_info() {
        System.out.println("Special department in the hospital that provides intensive care medicines.");
        System.out.println("Patients with life-threatening illness or injuries require constant care, supervision, and life support equipment.");
    }

    public void Services_available() {
        System.out.println("ICU or CCU includes very critical operations, such as:");
        System.out.println("1. Ventilator (Lung support)");
        System.out.println("2. Hemodialysis (Renal support)");
        System.out.println("3. Intra-Aortic Balloon Pump (Cardiac support)");
    }

    public String getPatientFilePath() {
        return "ICU_Patients.txt";
    }
}
