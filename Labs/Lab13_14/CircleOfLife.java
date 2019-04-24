package Labs.Lab13_14;
import Labs.Lab13_14.Species;

public class CircleOfLife {

    public static void main(String args[]) {

    	// Create a new Species object here, passing in the appropriate arguments\
    	Species cat = new Species("cat", 300, 4);
    	Species bobcat = new Species("bobcat", 1500, 2);
        // Print out the species' growth rate
    	System.out.println(cat.growthGate);
    	System.out.println(bobcat.growthGate);
        // Use the species' toString here
    	System.out.println(cat);
    	System.out.println(bobcat);
        // Call populationInXYears here
    	System.out.println(cat.populationInXYears(2));
        // Create a new Species object here, passing in the appropriate arguments
    	Species cat2 = new Species("cat", 30444440, 40);
        // using a very large number for the population (e.g. 100000000)
    	System.out.println(cat2.population);
        // Print out the species' population to make sure it is set to 1500
    	
        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
    	System.out.println(cat2.populationInXYears(2));
        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
		cat.mergeSpecies(cat2);
		System.out.println(cat);
    }
}
