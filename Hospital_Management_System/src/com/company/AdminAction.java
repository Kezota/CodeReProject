package com.company;

public class AdminAction implements MenuAction {
    public void execute() {
        new Admin().choose();
    }
}

