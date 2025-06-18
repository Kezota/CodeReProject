package com.company.Pharmacy;

import java.io.File;
import java.io.FileNotFoundException;
    import java.util.Scanner;

public class search_med extends Pharmacy {

    public void searchHeart() {
        readAndPrintFile("Cardiac_Medicines.txt");
    }

    public void searchBrain() {
        readAndPrintFile("Brain_Medicines.txt");
    }

    public void searchEye() {
        readAndPrintFile("Eye_Medicines.txt");
    }

    public void searchDental() {
        readAndPrintFile("Dental_Medicines.txt");
    }

    private void readAndPrintFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}

