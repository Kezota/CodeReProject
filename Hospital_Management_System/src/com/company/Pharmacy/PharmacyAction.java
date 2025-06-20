package com.company.Pharmacy;

import com.company.Menu.MenuAction;

public class PharmacyAction implements MenuAction {
    public void execute() {
        new Pharmacy().display();
    }
}