package Labs.Lab14;

public class Animal {
	
	private String name;
	private int topSpeed;		
	
	//create the getters and setters for the instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		
		if (topSpeed > 70 || topSpeed < 0) {
			
			System.out.println("Invalid Speed");
		} else {
			
			this.topSpeed = topSpeed;	
		}
		
	}
	
	
		
	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Print "Invalid Speed" if it is not within these values and leave
        // the speed unchanged.
	public Animal(String name, int topSpeed) {
		this.setName(name);
		this.setTopSpeed(topSpeed);
		
	}
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables

	public boolean equals(Object other) {
		
		
		if (other instanceof Animal) {
			Animal a = (Animal)other;
			
			if ((Math.abs(a.topSpeed - this.topSpeed)) <= 2) {
				return true;
				
			}
			
		}
		return false;
		
	}
        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	
	public String toString() {
		
		String returnString = "Name: "+ this.getName()+ " Top Speed: " +this.getTopSpeed();
		
		return returnString;
	}
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
}
