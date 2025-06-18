package com.company.Department;

import java.util.HashMap;
import java.util.Map;

public class DepartmentFactory {
    private static final Map<Integer, DepartmentData> departmentMap = new HashMap<>();

    static {
        departmentMap.put(1, new Cardialogy_Dep());
        departmentMap.put(2, new Neurology_Dep());
        departmentMap.put(3, new Eye_Dep());
        departmentMap.put(4, new Dentistry_Dep());
        departmentMap.put(5, new Lab());
    }

    public static DepartmentData getDepartmentByOption(int option) {
        return departmentMap.get(option);
    }
}
