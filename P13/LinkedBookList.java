package P13;



public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list !!!
	public void add(Book b){

        BookNode newNode = new BookNode(b, null);

	    if (this.size == 0){

	        head = newNode;
	        size++;
            //System.out.println("added book " + b + " to list. size now is " + this.size());
        } else {


            for (BookNode pos = head; pos != null; pos = pos.getNext()) {

                if (pos.getNext() == null) {
                    pos.setNext(newNode);
                    size++;
                    break;
                    //System.out.println("added book " + b + " to list. size now is " + this.size());
                }
            }
        }


	}
	
	//IMPLEMENT -- adds a book at the specific index,
	//  or at the end if index is greater than size
	public void add(Book b, int index){
        BookNode newNode;
        int counter = -1;
		if (index > size){
		    add(b);
        } else{
		    for (BookNode pos = head; pos != null; pos = pos.getNext()){
		        counter++;
		    if (counter == index-1){
		        newNode = new BookNode(b, pos.getNext());
		        pos.setNext(newNode);

            }



            }
        }


	}




	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
        if (size == 0){
            return null;
        }
        for (BookNode pos = head; pos != null; pos = pos.getNext()){

            if (pos.getNext().getBook().equals(b)) {
                pos.setNext(pos.getNext().getNext());
                return pos.getNext().getBook();
            }


        }


	    return null;
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		
		return null;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){

		return 0;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}




