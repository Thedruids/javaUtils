/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitiesproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Thomas
 */
public class Utilities {

    public static int readInt() {
        int number = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please insert an integer: ");

        while (true) {
            try {
                number = Integer.parseInt(br.readLine());
                return number;

            } catch (IOException io) {
                System.err.println("Input/Output Error, something fucked up captain");
            } catch (NumberFormatException n) {
                System.err.print("Please insert a valid integer: ");
            }
        }

    }

    public static double readDouble() {
        double number = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please insert a number: ");

        while (true) {
            try {
                number = Double.parseDouble(br.readLine());
                return number;

            } catch (IOException io) {
                System.err.println("Input/Output Error, something fucked up captain");
            } catch (NumberFormatException n) {
                System.err.print("Please insert a valid number: ");
            }
        }

    }

    public static String readString() {

        String words = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please insert an integer: ");

        while (true) {
            try {
                words = br.readLine();
                return words;

            } catch (IOException io) {
                System.err.println("Input/Output Error, something fucked up captain");
            } catch (NumberFormatException n) {
                System.err.print("Please insert a valid integer: ");
            }
        }

    }
    
    public static boolean nullSafeCompare(Object one, Object two){
        
        return one == null ? two == null : one.equals(two);
        
        
    }

}
