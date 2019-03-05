package EasyAssignments;

import java.util.Scanner;

public class P4 {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double grossSalary, interestIncome, capitalGains;
        int numOfExempt;
        double totalIncome, adjustedIncome, federalTax, stateTax;
        federalTax = 0;
        System.out.print("Salary: ");
        grossSalary = scan.nextDouble();
        System.out.print("Exemptions: ");
        numOfExempt = scan.nextInt();
        System.out.print("Interest: ");
        interestIncome = scan.nextDouble();
        System.out.print("Gains: ");
        capitalGains = scan.nextDouble();


        totalIncome = grossSalary + interestIncome + capitalGains - 5000.00;

        if (numOfExempt > 6) {// unsure
            numOfExempt = 6;
        }

        adjustedIncome = totalIncome - (numOfExempt * 1500.00);

        if(adjustedIncome >= 0 && adjustedIncome < 20000){
            federalTax = 0;
        }
        if(adjustedIncome >= 20000 && adjustedIncome < 35000){
            federalTax =
                    0.13 * (adjustedIncome-20000.00);

        }
        if(adjustedIncome >= 35000 && adjustedIncome < 50000){
            federalTax =
                    0.13 * (35000.00-20000.00) +
                    0.23 * (adjustedIncome-35000.00);
        }
        if(adjustedIncome >= 50000){
            federalTax =
                    0.13 * (35000.00-20000.00) +
                    0.23 * (50000.00-35000.00) +
                    0.28 * (adjustedIncome-50000.00);
            //federalTax = 0.28 * adjustedIncome;

        }


        stateTax = adjustedIncome * 0.065;



        System.out.printf("Total Income: $%.2f\nAdjusted Income: $%.2f\nTotal Tax: $%.2f\nState Tax: $%.2f\n", totalIncome, adjustedIncome, federalTax, stateTax);

    }
}
