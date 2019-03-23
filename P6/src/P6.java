// P6 Assignment
// Author: Bogdan A Vasilchenko
//   Date: Feb 27, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu

package P6.src;


public class P6 {


    private static Maze maze;
    private static int mazeWidth;
    private static int mazeHeight;


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

        //Move
        moveDown();


    }

    private static void moveDown() {

        for (int i = 0; i < maze.getHeight(); i++) {


            if (maze.getRow() % 2 == 0) {
                moveEven();


            } else {
                moveOdd();

            }
            maze.moveDown();

        }

    }

    private static void crazyI() {


        if (maze.getRow() % 2 == 0) {

            maze.moveDown();
            maze.moveRight();
            maze.moveRight();
            maze.moveUp();

        } else {

            maze.moveDown();
            maze.moveLeft();
            maze.moveLeft();
            maze.moveUp();
        }
    }

    private static void moveOdd() {

        for (int j = 0; j < maze.getWidth() - 1; j++) {
            if (!maze.moveLeft()) {

                j++;
                crazyI();

            }
        }

    }

    private static void moveEven() {

        for (int j = 0; j < maze.getWidth() - 1; j++) {


            if (!maze.moveRight()) {

                j++;
                crazyI();

            }


        }

    }


}
