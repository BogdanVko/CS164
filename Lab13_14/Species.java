package Lab13_14;

public class Species {	

    // Put the instance variable here.

    private String name = "";
    public int population = 0;
    public  int growthGate = 0;
    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.

    public Species(String name, int population, int growthRate) {
    	
    	if (population > 1500) {
    		population = 1500;
    	}
    	if (population < 1) {
    		population = 1;
    		
    	}
    	if (growthRate > 20) {
    		growthRate = 20;
    	}
    	if (growthRate < 1) {
    		growthRate = 1;
    		
    	}
    	
    	
    	this.name = name;
    	this.population = population;
    	this.growthGate = growthRate;
    	
    }
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        	this.name = this.name + other.name;
        	this.population = this.population + other.population;
        	
        	if(this.growthGate < other.growthGate) {
        		this.growthGate = other.growthGate;
        	}
    }

    public String toString(){
        // ....
        String returnStr = "Name of species: " + this.name +
        		"\nPopulation: " + this.population + "\nGrowthRate: " + this.growthGate + "%\n";
        return returnStr;
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by +  growth rate/100 * current population.

    public void grow() {
        // ....
        this.population += ((double)this.growthGate/100)*this.population;
        
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        // ....
    	int count = 0;
    	int returnInt = this.population;
    	
    	while (count < x) {
    		returnInt += (int)(((double)this.growthGate/100)*returnInt);
    		count++;
    	}
    	
        //int returnInt = (int)(x * ((double)this.growthGate/100)* this.population);
        return returnInt;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        
        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
        /**If the species are rabbits and their growth rate is 10%, population is 100,
         *  and x is 2, you should see

The projected population for the rabbits in 2 years will be 121. 
		**/
        Species rab = new Species("Rabbit", 100, 10);
        
        System.out.println(rab);
        System.out.println("in 2 years pop will be of rabbits: " + rab.populationInXYears(2));
       
        
    }
}
