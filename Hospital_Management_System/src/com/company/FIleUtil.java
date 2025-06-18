package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FIleUtil {
    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            System.out.println("Written");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public static void getFromFile(String fileName){
        try {
            File myObj=new File(fileName);
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
