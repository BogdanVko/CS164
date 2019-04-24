package Labs.R17;
// Labs.R17 Assignment
// Author: Bogdan A. Vasilchenko
// Date:   4/24/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu

public class R17 implements IR17{


    @Override
    /*    Precondition: n >= 0 (no need to check).
           Post condition:  returns the nth number in a sequence where each element
           is twice its predecessor, and starts with 1.
	 */
    public int pracSeq1(int n) {
        if (n==0){
            return 1;
        }
        else{
            return 2 * pracSeq1(n-1);
        }


    }

    @Override
    /*    Precondition: n >= 0 (no need to check).
			Postcondition:  returns the nth number in a sequence where each element
			is the sum of the previous 3, and starts with 1,2,3
	 */
    public int sequence2(int n) {

       if(n == 0) {
    	   return  1;
    	   
       }
       if(n == 1) {
    	   return 2;
    	   
       }
       if(n == 2) {
    	   return 3;
    	   
       }
       
              
       else{

           return  sequence2(n-1) + sequence2(n-2) +sequence2(n-3);
       }

    }

    @Override

    /* 		Precondition:  n >= 0 (no need to check).
	Postcondition:  returns the nth number in a sequence where each element is 
	twice its predecessor (n-1) plus 3 times its predecessor (n-2) and starts with
	1, 2. 7.
    */
    public int sequence3(int n) {
    	if(n == 0) {
     	   return  1;
     	   
        }
        if(n == 1) {
     	   return 2;
     	   
        }
        if(n == 2) {
     	   return 7;
     	   
        }
        
        else{
        	
        	return 2 * sequence3(n-1) + 3 * sequence3(n-2);
        }
    }

    
    public static void main(String[] args) {

        R17 rec = new R17();
        System.out.println("pracSeq1(int x):");
        System.out.println("Answer: " + rec.pracSeq1(5) + "   Expecting: 32");
        System.out.println("Answer: " + rec.pracSeq1(7) + "   Expecting: 128\n");

        System.out.println("sequence2(int x):");
        System.out.println("Answer: " + rec.sequence2(4) + "   Expecting: 11");
        System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 20\n");

        System.out.println("sequence3:");
        System.out.println("Answer: " + rec.sequence3(2) + "   Expecting: 7");
        System.out.println("Answer: " + rec.sequence3(3) + "   Expecting: 20");
        System.out.println("Answer: " + rec.sequence3(6) + "   Expecting: 547\n");

    }
}
