package com.company.util;

import java.util.Scanner;

public class Authenticator {
    public static boolean login(Scanner input) {
        System.out.println("**********************************************************************");
        System.out.println("\tTo Access Hospital System Enter LOGIN:");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("\tUSER NAME:\t");
        String username = input.next();
        System.out.print("\tPASSWORD:\t");
        String password = input.next();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("**********************************************************************");
        return username.equals("project") && password.equals("laaa");
    }
}
