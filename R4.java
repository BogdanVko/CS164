// R4 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Feb 1, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu

import java.util.Scanner;
import java.lang.Math;

public class R4 {
	public static void main(String[] args) {
		
		/** Outputs
		 * 15
		 * -7.5
		 * 12.0
		 * 
		// Operator precedence, integer math
	    System.out.println(2 - 23 % 10 + 3 * 12 - 20);

	    // Operator precedence, floating-point math
	    System.out.println(2.4 + 23.1 - 10.0 * 3.1 - 12.5 / 6.25);
	  
	    // Operator precedence, mixed math
	    System.out.println(65 % 15 + 3.5 * (5 / 2));
		
	    **/
	    
	    /**
	     * Following the instructions below, in order.

    Declare three variables of type int called A, B, and C, which represent the quadratic equation coefficients.
    Declare two variables of type double called positiveRoot and negativeRoot, to store the roots of the quadratic equation.
    Declare and instantiate an object of type Scanner to read from the keyboard, using a name of your choice.
    Prompt the user to input the A coefficient, using System.out.print, as follows: "Enter coefficient A: ".
    Read an integer from the keyboard into the variable A.
    Prompt the user to input the B coefficient, using System.out.print, as follows: "Enter coefficient B: ".
    Read an integer from the keyboard into the variable B.
    Prompt the user to input the C coefficient, using System.out.print, as follows: "Enter coefficient C: ".
    Read an integer from the keyboard into the variable C.
    Print the quadratic equation in the format shown in the sample output below.
    Look up the quadratic formula on the web.
    Compute the positive root and store it into the variable positiveRoot.
    Compute the negative root and store it into the variable negativeRoot.
    Print the positive root, with one digit after the decimal point, as shown below.
    Print the negative root, with one digit after the decimal point, as shown below.

	Sample Output
	
	Enter coefficient A: 1
	Enter coefficient B: -11
	Enter coefficient C: 24
	Formula: 1x^2 + -11x + 24
	Positive root: 8.0
	Negative root: 3.0

	     */
		
	int a, b, c;
	double positiveRoot, negativeRoot;
	Scanner scan = new Scanner(System.in);
	
	
	System.out.print("Enter coefficient A: ");
	a = scan.nextInt();
	
	System.out.print("Enter coefficient B: ");
	b = scan.nextInt();
	
	System.out.print("Enter coefficient C: ");
	c = scan.nextInt();
	
	System.out.printf("Formula %dx^2 + %dx + %d\n", a, b, c);
	
	positiveRoot = ( (-1 * b) + Math.sqrt(b*b - 4*a*c) ) / (2*a);
	negativeRoot = ( (-1 * b) - Math.sqrt(b*b - 4*a*c) ) / (2*a);
	
	System.out.printf("Positive root: %.1f\nNegative root: %.1f", positiveRoot, negativeRoot);
	}
}
