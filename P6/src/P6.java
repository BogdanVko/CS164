// P6 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Feb 27, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu

public class P6 {

    // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze
        int c = 0;
        
        while(c < 7) {
        	maze.moveRight();
        	c++;
        }
        int d = 0;
        while(d < 4) {
        	maze.moveDown();
        	d++;
        }
        
        for(int i = 0; i < 6; i++) {
        	
        	maze.moveLeft();
        }
        
		for(int i = 0; i < 6; i++) {
		        	
			maze.moveUp();
		}
        	//maze.moveRight();
        
        
    }
}   
