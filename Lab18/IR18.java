package Lab18;


// R18 Assignment
// Author: Russ Wakefield
// Date:   Apr 9, 2017
// Class:  CS163/164
// Email:  waker@cs.colostate.edu

public interface IR18 {


/*		Method: starString
 		Precondition: x >= 1 (does not need to be checked)
		Postcondition: returns String containing x number of '*'s
    		Requirement: starString must work recursively
*/
	public String starString(int x);



/* 		Method: starPattern
 		Precondition: x >= 1 (does not need to be checked)
    		Postcondition: prints the appropriate star pattern for the value of x
    		Requirement: starPattern must work recursively
    		Requirement: Uses a recursive helper method starString
*/
	public void starPattern(int x);
	
/* 		Method: palindrome
 		Precondition:  word is an instance of String
		Postcondition:  returns true if word is a palindrome, and false otherwise
		Requirement: palindrome must work recursively
*/
	public boolean palindrome(String word);

}
