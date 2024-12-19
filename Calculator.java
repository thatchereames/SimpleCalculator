/**
 * Calculates values based on user input. 
 */
import java.util.Scanner;

public class Calculator {
    //Instance Variables
    private static final String CALCULATION_KEY = "Use + for addition and - for"
    + " substration\nUse * for multiplication and / for division\nUse , to "
    + "denote fractions and ^ for exponentation";

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println(CALCULATION_KEY);
        boolean contin = true;
        int numOfCalculations = 0;
        String calculation;
        while (contin) {
            System.out.println("Calculation number " + numOfCalculations + ":");
            calculation = myScanner.nextLine();
            if (calculation.equals("quit")); {
                contin = false;
            }
            numOfCalculations++;
        }
    }
}