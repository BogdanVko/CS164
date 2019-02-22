// R7 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Feb 22, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
public class R8 {
	
	/*
	 * 
	 *
Complete printAscii() using a for loop, print out all characters in the ascii
 table between the codes: start and end (inclusive). Each character should be 
 on a separate line that contains the ascii code followed by a colon, space, then
  the character itself. HINT: Use a loop counter of type char.
Complete raiseToPower() using a while loop. DO NOT USE Math.POW()!!!! The method 
computes and returns the specified floating-point number raised to the supplied
 integer exponent, and does not print anything. 
	 * */
	public static void reverseString(String s) {
		
	    for (int i = s.length()-1; i >= 0; i--) {
	    	
	    	System.out.print( s.charAt(i));
	    	
	    }
	    
	    System.out.print("\n");
	}

	public static void printAscii(char start, char end) {
	    // add code here
		for(int i = (int)start; i <= (int)end; i++) {
			
			char ch = (char)i;
			
			
			
			System.out.printf("%d: %c\n", i, ch );
			
		}
	}

	public static double raiseToPower(double number, int exponent) {
		
	    double finalValue = number;
	    
	    int count = 1;
		while (count < exponent) {
			
			finalValue = finalValue * number;
			
			count++;
		}
		
		
		return finalValue;
	}
	
	public static void main(String[] args) {
		
		 String forward = "Java Programming rules!";
		 System.out.print("Forward string: ");
		 System.out.println(forward);
		 System.out.print("Reverse string: ");
		 reverseString(forward);
		
		
		System.out.println("ASCII Table");
	    printAscii('!', '9');
	    
	 // Test raiseToPower
	    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
	    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));
		
	}

}
