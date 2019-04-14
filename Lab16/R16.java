package Lab16;
// R16      Assignment
// Author : Bogdan A Vasilchenko
// Date   : Feb 27, 2019
// Class  : CS164
// Email  : vba@cs.colostate.edu

import java.util.ArrayList;

import java.util.Scanner;
import java.io.*;

public class R16{
    ArrayList<String> words = new ArrayList<>();
    
    public static void readFile( String inputFile ) throws IOException {

        File file = new File(inputFile);
        Scanner sc = null;
        try {
            sc = new Scanner(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            Scanner s2 = new Scanner(sc.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();
                String type = s2.next().getClass().getSimpleName();
                System.out.println(type + ": " + s); // doesn't work right

            }
        }
    }

    public static void writeFile( String outputFile ) throws IOException{
        PrintWriter writer = new PrintWriter(outputFile);


    }
    
    

    
    public static void main(String[] args) throws IOException {
        readFile(args[0]);
    }
}