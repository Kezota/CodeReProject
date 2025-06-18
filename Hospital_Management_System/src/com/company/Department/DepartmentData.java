package com.company.Department;

public abstract class DepartmentData {
    private String departmentName;

    public DepartmentData(String name) {
        this.departmentName = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public abstract void dep_info();
    public abstract void Services_available();
    public abstract String getPatientFilePath();  
}
