package com.company.Department;

import com.company.Menu.MenuAction;

public class DepartmentAction implements MenuAction {

    @Override
    public void execute() {
        new Dep().Dep_Display();
    }
}
