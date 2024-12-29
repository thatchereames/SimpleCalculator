/**
 * Calculates values based on user input. 
 */
import java.util.Scanner;

public class Calculator {
    //Instance Variables
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