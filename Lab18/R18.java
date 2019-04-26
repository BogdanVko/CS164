package Lab18;
// R18 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Apr 26, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
public class R18 implements IR18{

	@Override
	public String starString(int x) {
		// TODO Auto-generated method stub
		if(x <= 0) {
			return "";
			
		} else {
			return "*" + starString(x-1);
		}
		
		
	}

	@Override
	public void starPattern(int x) {
		if(x <= 0) {
			System.out.print("");
			
		} else {
			System.out.println( starString(x));
			starPattern(x-1);
		}
		
	}

	@Override
	public boolean palindrome(String word) {
		
		if (word.length() <= 1) {
			return true;
		}
		else {
			
			if(word.charAt(0) == word.charAt(word.length()-1)) {
				
				
				return palindrome(word.substring(1, word.length()-1));
			
			
			} else {
				return false;
			}
		}
		
	}
	
	public static void main(String args[]){
		R18 rec = new R18();
		//System.out.println(rec.starString(5));
		rec.starPattern(5);
		System.out.println(rec.palindrome("TACOfCAT"));
		
		
		
	}

}
