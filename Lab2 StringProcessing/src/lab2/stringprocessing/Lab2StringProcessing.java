/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kiaka
 */
public class Lab2StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]record = new String[100];
        
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            int currIndex = 0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                
                String firstName = line[0];
                String lastName = line[1];
                String gender = line[2];
                String age = line[3];
                String number = line[4];
                String email = line[5];
                
                record[currIndex]= String.format(" ");
                currIndex++;
                String output;
                output = String.format("%-20s%-20s%-10s%10s%20s%40s",firstName,lastName,gender,age,number,email);
                    System.out.println(output);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Input file not found");
        }
    }
    
}
