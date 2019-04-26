package P11;

import java.util.ArrayList;

// P11 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Apr 26, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
public class P11 implements IP11 {

	public String patternLine( int s){

		if (s <= 0){
			return "";
		} else{


			return "-" + patternLine(s-1);

		}
	}

	public String patternStar(int s){
		if (s <= 0){
			return "";
		} else{

			return "*" + patternStar(s-1);

		}
	}
	@Override
	/* 		Method: printPattern
		Precondition: n>0
	Post condition: Print a pattern of n+1 ( 0 to n ) lines
	Post condition: line i (i = 0 to n) has i stars ("*") followed by (n-i) stripes ("-")
	 */
	public void printPattern(int n) {
		printPattern2(n, n);

	}
	private void printPattern2(int lines, int stars){
		if(lines < 0){
			System.out.print("");
		} else {

			System.out.println(patternStar(stars-lines) + patternLine(lines));
			printPattern2(lines -1, stars);

		}


	}

		


	@Override
	public int convertNum(int[] num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){

		P11 rec = new P11();

		rec.printPattern(3);
		//System.out.println(rec.patternStar(4));

	}

}
