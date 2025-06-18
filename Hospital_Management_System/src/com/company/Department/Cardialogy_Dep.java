package com.company.Department;

public class Cardialogy_Dep extends DepartmentData {

    public Cardialogy_Dep() {
        super("Cardiology");
    }

    public void dep_info() {
        System.out.println("It deals with the treatment of disorders of heart and blood vessels.");
        System.out.println("This field includes medical diagnosis, treatment of congenital heart defects, heart failure, valvular heart disease.");
    }

    public void Services_available() {
        System.out.println("Services available are:");
        System.out.println("1. Angiography");
        System.out.println("2. Heart Surgery");
        System.out.println("3. CT of heart");
        System.out.println("4. ECG test");
        System.out.println("5. BP checkup");
    }

    public String getPatientFilePath() {
        return "Heart_Patients.txt";
    }
}
