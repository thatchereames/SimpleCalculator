/**
 * Creater: Thatcher Eames
 * Email: thatcher.eames@gmail.com
 * File Name: Calculator
 * 
 * This file creates a typing calculator. Users simpling type in the
 * calculations they wish to make following the format guidelines provided. 
 */
import java.util.Scanner;

/**
 * This class is a calculator that parses a string input from the user into data
 * that is calculated. The string input is parsed based on a format given to
 * the user.
 */
public class Calculator {
    //Helper varibables
    private static final String CALCULATION_KEY = "Type + - * / () ^ ! for "
    + " their typical calculations.\nType , to denote a fraction\nType quit at " 
    + "any time to exit the program. Type help to view this menu again.";

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Typing Calculator!");
        System.out.println(CALCULATION_KEY);
        boolean contin = true;
        int numOfCalculations = 1;
        String calculation;
        //Continues asking for input and calculating until the user exits
        while (contin) {
            System.out.print("Calculation " + numOfCalculations + ": ");
            calculation = myScanner.nextLine();
            if (calculation.equals("quit")) {
                contin = false;
            } else if (calculation.equals("help")) {
                System.out.println(CALCULATION_KEY);
            }
            numOfCalculations++;
        }
    }
}