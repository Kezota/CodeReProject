package com.company.Department;

public class Cardialogy_Dep extends DepartmentData{
    public Cardialogy_Dep() {
        super("Cardiology");
    }
    public void dep_info() {
        System.out.println("It deals with the treatment of Disorders of heart and blood vessesls");
        System.out.println("This field includes medical diagonosis,treatment of congetial heart defects,heart faliure,valvular heart disease");
    }
    public void Services_available() {
        System.out.println("Services available are:\n1.Angiography\n2.Heart Surgery\n3.CT of heart\n4.ECG test\n5.BP checkup");
    }
    public String getPatientFilePath() {
        return "Heart_Patients.txt";
    }
}