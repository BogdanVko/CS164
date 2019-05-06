package P13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class R20 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		LinkedBookList lbl = new LinkedBookList();
		
		Scanner scan = new Scanner(new File("src/P13/top10.txt"));
		int bookCount = (Integer.parseInt(scan.nextLine()));
		
		//reads in all of the books, and adds them to the linked list
		for(int i = 0; i < bookCount; i++){
			String line = scan.nextLine();
			String[] parts = line.split("\t");
			String name = parts[0];
			String title = parts[1];
			int numPages = Integer.parseInt(parts[2]);
			Book b = new Book(name, title, numPages);
			lbl.add(b);
		}
		
		System.out.println("Testing add");
		System.out.println(lbl);

		Book b2 = new Book("Me", "Life of CSB", 123);
        lbl.add(b2, 3);
        System.out.println("\n\nTry adding my book at index 3\n \n"+ lbl);


        lbl.remove(b2);
        System.out.println("\n\nTry removing my book\n \n"+ lbl);

        lbl.remove(3);
        System.out.println("\n\nTry removing a book at index 3\n \n"+ lbl);


        System.out.println("total pages = "+ lbl.totalPages());
        scan.close();





	}
}

