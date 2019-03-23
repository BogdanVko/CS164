package Labs.R12;

// R12 Assignment
// Author: Bogdan A. Vasilchenko
// Date:   03/09/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu

public class R12 implements RecitationInterface{


    private PictureLibrary library;
    private int imageWidth = 0;
    private int imageHeight = 0;
    private int[][] data;

    public R12(){
        //Instantiate PictureLibrary object
        library = new PictureLibrary();

    }


    @Override
    public void readImage(String inFile) {
        try {
            // Calls to readPGM or writePGM and associated code here
            library.readPGM(inFile);
            data = library.getData();
            imageHeight = library.getHeight();
            imageWidth = library.getWidth();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void writeImage(String outFile) {
        try {
        library.setData(data);
        library.writePGM(outFile);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public int[][] imageData() {
        return data;
    }

    @Override
    public void negateImage() {

        for (int i = 0; i < data.length; i ++){
            for (int j = 0; j < data[i].length; j++){
                data[i][j] = PictureLibrary.MAXVAL - data[i][j];

            }

        }
    }

    @Override
    public void increaseContrast() {

        for (int i = 0; i < data.length; i ++){
            for (int j = 0; j < data[i].length; j++){
            if ((0 <= data[i][j]) && (data[i][j] <= 127)) {
                data[i][j] -= 16;
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }

            }

            if ((128 <= data[i][j]) && (data[i][j] <= PictureLibrary.MAXVAL)){
                data[i][j] += 16;
                if (data[i][j] > PictureLibrary.MAXVAL) {
                    data[i][j] = PictureLibrary.MAXVAL;
                }

            }

            }
        }
    }

    @Override
    public void decreaseContrast() {
        for (int i = 0; i < data.length; i ++){
            for (int j = 0; j < data[i].length; j++){
                if ((0 <= data[i][j]) && (data[i][j] <= 127)) {
                    data[i][j] += 16;
                    if (data[i][j] < 0) {
                        data[i][j] = 0;
                    }

                }

                if ((128 <= data[i][j]) && (data[i][j] <= PictureLibrary.MAXVAL)){
                    data[i][j] -= 16;
                    if (data[i][j] > PictureLibrary.MAXVAL) {
                        data[i][j] = PictureLibrary.MAXVAL;
                    }

                }

            }
        }
    }
}
