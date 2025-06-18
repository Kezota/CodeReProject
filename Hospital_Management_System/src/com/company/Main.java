package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (Authenticator.login(input)) {
            MenuHandler menu = new MenuHandler(input);
            menu.run();
        } else {
            System.out.println("***WRONG!!!!!!!USER NAME OR PASSWORD*****");
        }
        input.close();
    }
}
