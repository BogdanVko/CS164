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

		



	/*		Method: convertNum
	 		Precondition: num.length > 0
	 		Post condition: return int representation of num, (e.g num:{1,2,3} returns int: 123)
	 */
	private String convertNumtoString(int[] num){
		if (num.length == 0) {
			return "";
		}else{
			String returnString = "";
			returnString = Integer.toString(num[0]);
			int n = num.length-1;

			int[] newArray = new int[n];

			System.arraycopy(num,1,newArray,0,n);
			return returnString + convertNumtoString(newArray);
		}
	}
	@Override
	public int convertNum(int[] num) {

		return Integer.valueOf(convertNumtoString(num));
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		if(AL1.size() <= 0){
			return null;
		} else{
			ArrayList<String> returnArray = new ArrayList<>();
			returnArray.add("d");


		}
		return null;
	}

	public static void main(String[] args){

		P11 rec = new P11();

		rec.printPattern(3);
		int[] array =  {1,2,3,4,5};
		System.out.println(rec.convertNum(array));



		//System.out.println(rec.patternStar(4));

	}

}
