package R19;

public interface IR19 {

	/*    Method - sumDigits
 	   Precondition: n >= 0 (no need to check).
           Postcondition:  Returns the sum of its base-10 digits
           (ex. sumDigits 1234 returns 10).
	   Note - easy to split an integer by dividing by 10
	   (1234/10 = 123, 1234%10 = 4)
	 */
	public int sumDigits (int n);

	/* Method - countCannonballs   
 	   Precondition: n >= 1 (no need to check).
	   Postcondition:  Returns the total number of cannonballs in stack
	   Note: The cannonball stack starts with one on the top of a square
 	   of four, sitting on a square of 9, and so forth.
	 */
	public int countCannonballs (int n);

	/* Method - numDigits 
	   Precondition:  n >= 0 (no need to check).
	   Postcondition:  returns the number of digits in a base-10 number
           (ex. numDigits 1234 returns 4)
	 */
	public int numDigits (int n);

	/* Method - backString
	   Precondition:  s is a non-null string (no need to check).
	   Postcondition:  returns the string reversed.
           (ex. backString yes returns sey)
	 */
	public String backString (String s);

}
