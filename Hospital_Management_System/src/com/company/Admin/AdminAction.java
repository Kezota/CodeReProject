package com.company.Admin;

import com.company.Menu.MenuAction;

public class AdminAction implements MenuAction {
    public void execute() {
        new Admin().choose();
    }
}

