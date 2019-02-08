// P2 Assignment
// Author: Vasilchenko, Bogdan
// Date:   02/02/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu


import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        // Declare variables for mysterious formulas
        double alphaAcid, ounces, weight, lovibond, volume, hbu, srm;
        // Instantiate scanner
        Scanner keyboard = new Scanner(System.in);

        // Prompt and read alphaAcid from keyboard
        System.out.print("Alpha Acid? ");
        alphaAcid = keyboard.nextDouble();

        // Prompt and read ounces from keyboard
        System.out.print("Ounces? ");
        ounces = keyboard.nextDouble();

        // Calculate HBUs
        hbu = alphaAcid * ounces;

        // Print HBUs to console
        System.out.printf("The HBUs are %.2f.\n", hbu);

        // Prompt and read remaining variables
        System.out.print("Weight? ");
        weight = keyboard.nextDouble();

        System.out.print("Lovibond? ");
        lovibond = keyboard.nextDouble();

        System.out.print("Volume? ");
        volume = keyboard.nextDouble();

        // Compute the SRM value using the formula
        srm = (0.3 * weight * lovibond / volume) + 4.7;

        // Print SRM to console
        System.out.printf("The SRM value is %.4f.", srm);

        // Close scanner
        keyboard.close();
    }
}