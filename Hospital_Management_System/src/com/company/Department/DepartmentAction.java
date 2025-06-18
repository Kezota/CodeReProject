package com.company.Department;

import com.company.Menu.MenuAction;

public class DepartmentAction implements MenuAction {
    public void execute() {
        new Dep().Dep_Display();
    }
}
