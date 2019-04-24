package Labs.R17;

public interface IR17 {

	/*    Precondition: n >= 0 (no need to check).
           Postcondition:  returns the nth number in a sequence where each element 
           is twice its predecessor, and starts with 1.
	 */
	public int pracSeq1(int n);

	/*    Precondition: n >= 0 (no need to check).
			Postcondition:  returns the nth number in a sequence where each element 
			is the sum of the previous 3, and starts with 1,2,3
	 */
	public int sequence2(int n);



	/* 		Precondition:  n >= 0 (no need to check).
			Postcondition:  returns the nth number in a sequence where each element is 
			twice its predecessor (n-1) plus 3 times its predecessor (n-2) and starts with
			1, 2. 7.
	 */
	public int sequence3(int n);

}
