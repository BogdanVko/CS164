// R10 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Mar 1, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
public class R10 {
	
	
	public static String reverseCase(String initialS) {
		String returnString = "";
		
		if (initialS == null) {
			return "null";
		}
		
		for (int i =0; i < initialS.length(); i++) {
			if (Character.isUpperCase(initialS.charAt(i))) {
				returnString += Character.toLowerCase(initialS.charAt(i));
			} else {
				
				returnString += Character.toUpperCase(initialS.charAt(i));
			}
			
		}
		
		return returnString;
		
	}
	
	
	public static double circleArea(double radius) {
		
		return Math.PI * radius * radius;
		
	}
	
	
	public static double sphereVolume(double radius) {
		
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	
	public static int round (double initNum) {
		if (initNum <= 0) {
			
			return 0;
		}
		if (initNum % (int)initNum < .5) {
			
			return (int)Math.floor(initNum);
		}
		else {
			
			return (int)Math.ceil(initNum);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("The Area radius 2 is " +circleArea(2.0));
		System.out.println("Thevolume radius 4 is " + sphereVolume(4.0));
		System.out.println("5.1 rounded is " + round(5.1));//5
		System.out.println("5.4 rounded is " + round(5.4));//5
		System.out.println("5.5 rounded is " + round(5.5));//6
		System.out.println("5.9 rounded is " + round(5.9));//6  Works correctly
		
		System.out.println(reverseCase("Hello World!"));
		
	}

}
