package com.company.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.company.Admin.AdminAction;
import com.company.Department.DepartmentAction;
import com.company.Pharmacy.PharmacyAction;

public class MenuHandler {
    private final Scanner input;
    private final Map<Integer, MenuAction> actions = new HashMap<>();

    public MenuHandler(Scanner input) {
        this.input = input;
        registerActions();
    }

    private void registerActions() {
        actions.put(1, new AdminAction());
        actions.put(2, new DepartmentAction());
        actions.put(3, new PharmacyAction());
    }

    public void run() {
        int option;
        do {
            try {
                showMainMenu();
                option = input.nextInt();
                input.nextLine();

                MenuAction action = actions.get(option);
                if (action != null) {
                    action.execute();
                } else {
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                }

                System.out.println("Enter 1 to Exit, any other number to continue:");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
                option = -1;
            }
        } while (input.nextInt() != 1);
    }

    private void showMainMenu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("          Welcome To Hospital Management System");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. ADMIN");
        System.out.println("2. DEPARTMENTS");
        System.out.println("3. PHARMACY");
        System.out.print("Enter option: ");
    }
}
