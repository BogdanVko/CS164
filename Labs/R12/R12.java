package Labs.R12;
// R12 Assignment
// Author: Bogdan A. Vasilchenko
// Date:   03/09/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu




public class R12 implements RecitationInterface{


    private PictureLibrary library = new PictureLibrary();
    private int imageWidth = 0;
    private int imageHeight = 0;
    private int[][] imageData;

    public R12(){
        //Instantiate PictureLibrary object

    }


    @Override
    public void readImage(String inFile) {

    }

    @Override
    public void writeImage(String outFile) {

    }

    

    @Override
    public int[][] imageData() {
        return new int[0][];
    }

    @Override
    public void negateImage() {

    }

    @Override
    public void increaseContrast() {

    }

    @Override
    public void decreaseContrast() {

    }
}
