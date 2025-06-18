package com.company;

public class PharmacyAction implements MenuAction {
    public void execute() {
        new Pharmacy().display();
    }
}