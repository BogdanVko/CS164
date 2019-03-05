package EasyAssignments;
// EasyAssignments.P5 Assignment
// Author: Bogdan A. Vasilchenko
// Date:   02/24/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu


import java.util.Scanner;

public class P5 {


    // Method to check whether an integer is prime.
    public static boolean isPrime(int number) {

        // DO NOT CHANGE THIS CODE!
        for(int i=2;i<=number/2;i++)
            if(number%i==0)
                return false;
        return true;
    }

    // Method to print primes in a specified range
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++){

            System.out.print(isPrime(i) ? i + ", ": "");
           /* if (isPrime(i)){
                 System.out.print(i + ", ");
            }*/

        }
        System.out.print("\n");
    }

    // Method to remove vowels from a string
    public static String removeVowels(String input) {
        String returnString = "";

        for (int i = 0; i < input.length(); i++){
            if (!("aeiouAEIOU".indexOf(input.charAt(i)) != -1)){ //is a v
                returnString = returnString + input.charAt(i);

            }

        }
        return returnString;
    }

    // Method to generate and print the value of a number raised to an exponent
    public static double evaluateExponent(double number, int exponent) {
        int loop = 0;
        double result = 1.0;
        do{
            result *= number;
            loop++;

        }
        while (loop < exponent);
        return result;
    }

    // Method to find and print the minimum/maximum/mean of a set of positive numbers
    public static void computeStatistics(int sentinel) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int count = 0;
        double mean = 0.0;
        double all = 0.0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        while(true){
            value = scan.nextInt();
            if (value == -1){
                break;

            }
            if (value < minimum){
                minimum = value;
            }
            if (value > maximum){

                maximum = value;
            }

            all += value;
            //System.out.println(value + "i is the value");

            count++;


        }

        mean = all / count;

        System.out.println("Count: " + count);
        System.out.printf("Average: %.1f\n", mean);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: "+ minimum);

    }

    public static void main(String[] args){
        // Preliminary testing
        printPrimes(1, 50);
        System.out.println(removeVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        double result = evaluateExponent(2.0,16);
        System.out.println("2.0 to the 16 = " + result);
        computeStatistics(-1);


    }
}
