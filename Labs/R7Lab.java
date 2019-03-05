package Labs;
// R7 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Feb 20, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R7Lab {

    public static void main(String[] args) {

        // Declare variables
        int int0=0, int1=0;
        double real0=0.0, real1=0.0;
        char char0=' ', char1=' ', char2=' ';
        String string0="", string1="", string2="";
        
        try {

            // Open input stream
            Scanner scan = new Scanner(new File("data.txt"));

            // Read contents
            string0 = scan.nextLine();
            string1 = scan.nextLine();
            string2 = scan.nextLine();
            char0 = scan.next().charAt(0);
            char1 = scan.next().charAt(0);
            char2 = scan.next().charAt(0);
            int0 = scan.nextInt();
            int1 = scan.nextInt();
            real0 = scan.nextDouble();
            real1 = scan.nextDouble();

            // Close input stream
            scan.close();

        } catch (IOException e) {
            System.out.println("Cannot read file: data.txt");
            System.exit(0);
        }
        
        /*
A) Print an expression that adds the product of int0 multiplied by 17 to the product of int1 multiplied by 7.
B) Print an expression that subtracts real0 from real1, then divides the result by 4.321.
C) Print real1 to the fifth power using Math.pow() with exactly 6 digits after the decimal.
D) Print the 4th character of string0, the 3rd character of string1, and the last character of string2, separated by commas. The code should work regardless of the length of string2!
E) Print the length of string1 added to the ASCII value of the first character of string1. HINT: Type cast the first character of string1 to get an integer before the addition.
F) Print the product of the ASCII values of char0, char1, and char2.
G) Print the boolean that is returned from using a comparison operator to check whether string2 is equal to "Hello World!".
H) Write a conditional (if/else if/else) statement as follows:

    Print "Starts with uppercase letter." if string1 starts with an uppercase letter.
    Print "Starts with lowercase letter." if string1 starts with a lowercase letter.
    Otherwise print "Does not start with a letter."

I) Write a switch statement as follows:

    The switch statement should check the value of char1.
    If char1 equals '$', '@', or '#', print "Special Character".
    If char1 equals '2', '4', '6', or '8', print "Even Digit".
    If char1 equals '1', '3', '5', '7', or '9', print "Odd Digit".
    If char1 equals 'a', 'e', 'i', 'o', or 'u', print "Vowel Letter".
    Otherwise using System.out.println() to print the string "Unknown character".


         * */
        System.out.println(int0*17+int1*7);
        System.out.println((real1 - real0)/4.321);
        System.out.printf("%.6f\n", Math.pow(real1, 5));
        System.out.println(string0.charAt(3) + ","+ string1.charAt(2) + "," + string2.charAt(string2.length()-1));
        
        int valueOfCh = string1.charAt(0);
        System.out.println(string1.length() +  valueOfCh ) ;
        
        int productOfCh = char0 * char1 *char2;
        System.out.println(productOfCh);
        System.out.println(string2 == "Hello World!");
        
        
        boolean isCapital = Character.isUpperCase(string1.charAt(0));
        if (Character.isAlphabetic(string1.charAt(0))) {
        	
        	System.out.println(isCapital ? "Starts with uppercase letter." : "Starts with lowercase letter.");
        } else {
        	System.out.println("Does not start with a letter.");
        }
        
        switch(char1) {
        case '$':
        case '@':
        case '#':
        	System.out.println("Special Character");
        	break;
        case '2':
        case '4':
        case '6':
        case '8':
        	System.out.println("Even Digit");
        	break;
        case '1':
        case '3':
        case '5':
        case '7':
        case '9':
        	System.out.println("Odd Digit");
        	break;
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	System.out.println("Vowel Letter");
        	break;
        default:
        	System.out.println("Unknown character");
        	break;
        
        }
    
    }
}
