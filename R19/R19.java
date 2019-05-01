package R19;

public class R19 implements IR19 {
    @Override
    /*    Method - sumDigits
 	   Precondition: n >= 0 (no need to check).
           Postcondition:  Returns the sum of its base-10 digits
           (ex. sumDigits 1234 returns 10).
	   Note - easy to split an integer by dividing by 10
	   (1234/10 = 123, 1234%10 = 4)
	 */
    public int sumDigits(int n) {
        if (n <= 0){
            return 0;
        } else{

            return n % 10  + sumDigits(n/10);
        }
    }

    @Override
    /* Method - countCannonballs
 	   Precondition: n >= 1 (no need to check).
	   Postcondition:  Returns the total number of cannonballs in stack
	   Note: The cannonball stack starts with one on the top of a square
 	   of four, sitting on a square of 9, and so forth.
	 */
    public int countCannonballs(int n) {
        if (n <= 1){
            return 1;
        } else {

            return n*n + countCannonballs(n-1);
        }

    }

    @Override
    /* Method - numDigits
	   Precondition:  n >= 0 (no need to check).
	   Postcondition:  returns the number of digits in a base-10 number
           (ex. numDigits 1234 returns 4)
	 */
    public int numDigits(int n) {
        if (n <= 0){
            return 0;
        } else{

            return 1  + numDigits(n/10);
        }
    }

    @Override
    /* Method - backString
	   Precondition:  s is a non-null string (no need to check).
	   Postcondition:  returns the string reversed.
           (ex. backString yes returns sey)
	 */
    public String backString(String s) {

        if(s.length() == 0){
            return "";
        } else {

            char c = s.charAt(s.length()-1);
            s = s.substring(0, s.length()-1);
            return c + backString(s);
        }
    }


    public static void main(String[] args){
        R19 rec = new R19();
        System.out.println("sumDigits(int x):");
        System.out.println("Answer (1234): " + rec.sumDigits(1234) + "   Expecting: 10");
        System.out.println("Answer (7): " + rec.sumDigits (7) + "   Expecting: 7");
        System.out.println("Answer (6789): " + rec.sumDigits (6789));
        System.out.println();

        System.out.println("countCannonballs (int x):");
        System.out.println("Answer (1): " + rec.countCannonballs(1) + "   Expecting: 1");
        System.out.println("Answer: " + rec.countCannonballs (4) + "   Expecting: 30");
        System.out.println("Answer (10): " + rec.countCannonballs (10));
        System.out.println();

        System.out.println("numDigits(int x):");
        System.out.println("Answer (1234): " + rec.numDigits(1234) + "   Expecting: 4");
        System.out.println("Answer (7): " + rec.numDigits (7) + "   Expecting: 1");
        System.out.println("Answer (678900): " + rec.numDigits (678900));
        System.out.println();

        System.out.println("backString(String s):");
        System.out.println("Answer (yes): " + rec.backString("yes"));
        System.out.println("Answer (): " + rec.backString(""));
        System.out.println("Answer (a): " + rec.backString("a"));
        System.out.println("Answer (CS163): " + rec.backString("CS163"));
    }
}
