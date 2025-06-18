package com.company.Pharmacy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.util.FIleUtil;

public class Pharmacy {

    public void display() {
        Scanner input = new Scanner(System.in);
        int c, a, n;

        do {
            System.out.println("*******  PHARMACY  *********");
            System.out.println("1. Add New Medicine\t2. Search Medicine List");
            System.out.print("Enter Option:\t");
            c = input.nextInt();

            Cardiac_med cardiac = new Cardiac_med();
            Neurology_med neuro = new Neurology_med();
            Eye_med eye = new Eye_med();
            Dental_med dental = new Dental_med();
            search_med search = new search_med();

            switch (c) {
                case 1:
                    System.out.println("Add Medicinal Drug In:");
                    System.out.println("1. Cardiology\n2. Neurology\n3. Eye\n4. Dental");
                    a = input.nextInt();

                    switch (a) {
                        case 1 -> cardiac.add();
                        case 2 -> neuro.add();
                        case 3 -> eye.add();
                        case 4 -> dental.add();
                    }
                    break;

                case 2:
                    System.out.println("View/Search Medicines of:");
                    System.out.println("1. Cardiology\n2. Neurology\n3. Eye\n4. Dental");
                    a = input.nextInt();

                    switch (a) {
                        case 1 -> search.searchHeart();
                        case 2 -> search.searchBrain();
                        case 3 -> search.searchEye();
                        case 4 -> search.searchDental();
                    }
                    break;
            }

            System.out.println("To Exit Pharmacy press 0");
            n = input.nextInt();

        } while (n != 0);

        input.close();
    }
}
